package com.abhinavan.onlineBookStore.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "cart_info")
public class Cart implements Serializable {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    private int cart_id;
    @OneToMany(targetEntity = Book.class)
    private List<Book> book;
    private int quantity;
}

