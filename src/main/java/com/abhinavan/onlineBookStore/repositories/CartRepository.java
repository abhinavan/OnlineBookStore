package com.abhinavan.onlineBookStore.repositories;

import com.abhinavan.onlineBookStore.models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Long>{
}
