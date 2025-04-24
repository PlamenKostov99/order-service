package smart.parcel.delivery.orderservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import smart.parcel.delivery.orderservice.service.OrderService;

@RestController
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
}
