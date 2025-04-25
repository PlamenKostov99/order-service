package smart.parcel.delivery.orderservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import smart.parcel.delivery.orderservice.dto.OrderCreateEvent;

@Service
@RequiredArgsConstructor
public class OrderEventProducer {
    private final KafkaTemplate<String, OrderCreateEvent> kafkaTemplate;

    public void sendOrderCreateEvent(OrderCreateEvent orderCreateEvent) {
        kafkaTemplate.send("order.created.topic", orderCreateEvent);
    }
}
