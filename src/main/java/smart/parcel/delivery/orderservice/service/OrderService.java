package smart.parcel.delivery.orderservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import smart.parcel.delivery.orderservice.dto.OrderCreateEvent;
import smart.parcel.delivery.orderservice.dto.OrderDto;
import smart.parcel.delivery.orderservice.entity.Order;
import smart.parcel.delivery.orderservice.mappers.OrderMapper;
import smart.parcel.delivery.orderservice.repository.OrderRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;
    private final OrderEventProducer orderEventProducer;

    public List<OrderDto> getOrders() {
        return orderRepository.findAll().stream().map(orderMapper::orderToOrderDto).collect(Collectors.toList());
    }

    public Long createOrders(OrderDto orderDto) {
        Order order = orderMapper.orderDtoToOrder(orderDto);
        Order save = orderRepository.save(order);

        OrderCreateEvent orderCreateEvent =
                OrderCreateEvent.builder()
                        .orderId(save.getId())
                        .destination(save.getDeliveryAddress())
                        .status(save.getStatus().toString())
                        .build();

        orderEventProducer.sendOrderCreateEvent(orderCreateEvent);

        return save.getId();
    }
}
