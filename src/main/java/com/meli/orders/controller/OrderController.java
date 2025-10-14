package com.meli.orders.controller;

import com.meli.orders.entity.Order;
import com.meli.orders.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    /** Create order */
    @PostMapping
    public ResponseEntity<Order> create(@RequestBody Order order) {
        Order created = orderService.createOrder(order);
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }

    /** Read all orders */
    @GetMapping
    public List<Order> findAll() {
        return orderService.getAllOrders();
    }

    /** Read one order by id */
    @GetMapping("/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id) {
        return orderService.getOrderById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    /** Update order */
    @PutMapping("/{id}")
    public ResponseEntity<Order> update(@PathVariable Long id, @RequestBody Order order) {
        try {
            Order updated = orderService.updateOrder(id, order);
            return ResponseEntity.ok(updated);
        } catch (RuntimeException ex) {
            return ResponseEntity.notFound().build();
        }
    }

    /** Delete order */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        orderService.deleteOrder(id);
        return ResponseEntity.noContent().build();
    }
}
