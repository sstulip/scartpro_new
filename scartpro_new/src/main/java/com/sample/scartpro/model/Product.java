package com.sample.scartpro.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "test", schema = "public" )
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private int id;

    @Column(name = "product")
    private String product;

    @Column(name = "price")
    private double price;
}

