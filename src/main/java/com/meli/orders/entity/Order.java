package com.meli.orders.entity;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDateTime;


/**
 * Represents an order placed in the online store.
 */
@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {


    /** Unique identifier for the order */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    /** Name of the customer who placed the order */
    private String customerName;


    /** Total amount in the order currency */
    private Double totalAmount;


    /** Timestamp when the order was created */
    private LocalDateTime orderDate;
}
