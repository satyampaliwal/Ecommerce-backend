package com.satyam.ecommerce_backend.model;

import jakarta.persistence.*;
import lombok.Data;
@Entity
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;

    private String description;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private Integer Stock;

    private String category;

}
