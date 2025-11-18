package com.silvia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.silvia.entity.OrderItem;

public interface OrderItemRepo extends JpaRepository<OrderItem, Long>{
    
}
