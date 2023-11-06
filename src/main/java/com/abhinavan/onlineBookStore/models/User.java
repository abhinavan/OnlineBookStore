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
@Table(name = "user_info")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    private int userId;

    private String emailId;
    private String password;
    private String firstName;
    private String lastName;
    private Long phone;
    private String address;
    private List<UserRole> roles;
}
