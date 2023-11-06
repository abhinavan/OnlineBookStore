package com.abhinavan.onlineBookStore.repositories;

import com.abhinavan.onlineBookStore.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
