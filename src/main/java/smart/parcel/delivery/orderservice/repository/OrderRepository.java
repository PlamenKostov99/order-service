package smart.parcel.delivery.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import smart.parcel.delivery.orderservice.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
