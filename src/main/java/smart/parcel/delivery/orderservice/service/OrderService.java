package smart.parcel.delivery.orderservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import smart.parcel.delivery.orderservice.repository.OrderRepository;

@Service
@RequiredArgsConstructor
public class OrderService {
    private OrderRepository orderRepository;

}
