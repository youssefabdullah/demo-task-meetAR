package com.meetAr.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "Product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Name is required")
    private String name;

    private String description;

    @PositiveOrZero(message = "Price must be non-negative")
    private BigDecimal price;

    @PositiveOrZero(message = "Stock quantity must be non-negative")
    private Integer stockQuantity;

    // Getters and setters
}
