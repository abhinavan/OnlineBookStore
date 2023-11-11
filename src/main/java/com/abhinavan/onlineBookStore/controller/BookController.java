package com.abhinavan.onlineBookStore.controller;

import com.abhinavan.onlineBookStore.models.Book;
import com.abhinavan.onlineBookStore.services.ManageBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController
{

    @Autowired
    private ManageBookService manageBookService;
    @PostMapping("/addBook")
    public ResponseEntity<Book> addBook(@RequestBody Book book)
    {
        System.out.println("BookController.addBook");
        return ResponseEntity.ok(manageBookService.addBook(book));
    }

    @GetMapping("/getAllBooks")
    public ResponseEntity<List<Book>> getAllBooks()
    {
        System.out.println("BookController.getAllBooks");
        return ResponseEntity.ok(manageBookService.getAllBooks());
    }

    @GetMapping("/getBookByName/{name}")
    public ResponseEntity<Book> getBookByName(@PathVariable String name)
    {
        return ResponseEntity.ok(manageBookService.getBookByName(name));
    }

    @DeleteMapping("/removeBooksByName/{name}")
    public ResponseEntity<Book> removeBooksByName(@PathVariable String name)
    {
        System.out.println("BookController.removeBooksByName");
        return ResponseEntity.ok(manageBookService.removeBooksByName(name));
    }

    @PutMapping("/updateBookQuantity/{name}/{newQuantity}")
    public ResponseEntity<Book> updateBookQuantity(@PathVariable String name, @PathVariable int newQuantity)
    {
        System.out.println("BookController.updateBookQuantity");
        return ResponseEntity.ok(manageBookService.updateBookQuantity(name,newQuantity));
    }
}
