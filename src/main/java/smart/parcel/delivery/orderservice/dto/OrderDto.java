package smart.parcel.delivery.orderservice.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import smart.parcel.delivery.orderservice.entity.OrderStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class OrderDto {
    private String senderName;
    private String receiverName;
    private String pickupAddress;
    private String deliveryAddress;
    private String packageDetails;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
