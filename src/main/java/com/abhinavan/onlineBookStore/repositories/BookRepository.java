package com.abhinavan.onlineBookStore.repositories;

import com.abhinavan.onlineBookStore.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;

public interface BookRepository extends JpaRepository<Book,Long> {
    Book findByName(String name);

    @Modifying
    @Transactional
    @Query("UPDATE Book b SET b.quantity = :newQuantity WHERE b.name = :name")
    void updateBookQuantity(@Param("name") String name, @Param("newQuantity") int newQuantity);
}
