package smart.parcel.delivery.orderservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import smart.parcel.delivery.orderservice.dto.OrderDto;
import smart.parcel.delivery.orderservice.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @GetMapping
    public ResponseEntity<List<OrderDto>> getOrders(){
       return ResponseEntity.ok().body(orderService.getOrders());
    }

    @PostMapping
    public ResponseEntity<Long> createOrders(@RequestBody OrderDto orderDto){
        return ResponseEntity.ok().body(orderService.createOrders(orderDto));
    }
}
