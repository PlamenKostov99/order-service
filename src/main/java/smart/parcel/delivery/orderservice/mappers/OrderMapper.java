package smart.parcel.delivery.orderservice.mappers;

import org.mapstruct.Mapper;
import smart.parcel.delivery.orderservice.dto.OrderDto;
import smart.parcel.delivery.orderservice.entity.Order;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    OrderDto orderToOrderDto(Order order);
    Order orderDtoToOrder(OrderDto orderDto);
}
