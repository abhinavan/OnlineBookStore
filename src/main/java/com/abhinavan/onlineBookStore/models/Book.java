package com.abhinavan.onlineBookStore.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigInteger;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "book_info")
public class Book implements Serializable
{
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    private BigInteger barcode;
    private String name;
    private String author;
    private double price;
    private int quantity;
}
