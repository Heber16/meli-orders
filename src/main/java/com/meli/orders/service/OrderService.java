package com.meli.orders.service;

import com.meli.orders.entity.Order;
import com.meli.orders.repository.OrderRepository;
import org.springframework.stereotype.Service;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


/**
 * Service that contains business logic for orders.
 */
@Service
public class OrderService {


    private final OrderRepository orderRepository;


    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    /**
     * Creates a new order and sets the current timestamp.
     */
    public Order createOrder(Order order) {
        order.setOrderDate(LocalDateTime.now());
        return orderRepository.save(order);
    }


    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }


    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }


    public Order updateOrder(Long id, Order newOrder) {
        return orderRepository.findById(id)
                .map(order -> {
                    order.setCustomerName(newOrder.getCustomerName());
                    order.setTotalAmount(newOrder.getTotalAmount());
                    return orderRepository.save(order);
                })
                .orElseThrow(() -> new RuntimeException("Order not found with id=" + id));
    }


    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}