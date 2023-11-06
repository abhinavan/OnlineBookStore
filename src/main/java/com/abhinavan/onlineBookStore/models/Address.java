package com.abhinavan.onlineBookStore.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "address_info")
public class Address implements Serializable
{
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    private int address_id;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String country;
    private long pinCode;
    private String phone;
}
