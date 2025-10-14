package com.meli.orders.repository;

import com.meli.orders.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Repository for Order entity operations.
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}