package com.abhinavan.onlineBookStore.services;

import com.abhinavan.onlineBookStore.models.Book;
import com.abhinavan.onlineBookStore.repositories.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManageBookService
{

    private static final Logger LOGGER = LoggerFactory.getLogger(ManageBookService.class);
    @Autowired
    private BookRepository bookRepository;

    public Book addBook(Book book)
    {
        LOGGER.info("Adding book: {} to the database",book.getName());
        return bookRepository.saveAndFlush(book);
    }

    public List<Book> getAllBooks()
    {
        LOGGER.debug("Getting all books from the database");
        Sort sortByName = Sort.by(Sort.Direction.ASC,"name");
        return bookRepository.findAll(sortByName);
    }

    public Book removeBooksByName(String name){
        LOGGER.info("Removing book: {} from the database",name);
        Book book = bookRepository.findByName(name);
        bookRepository.delete(book);
        return book;
    }

    public Book updateBookQuantity(String name, int newQuantity){
        LOGGER.info("Updating book: {} quantity to {} in the database",name,newQuantity);
        bookRepository.updateBookQuantity(name,newQuantity);
        return bookRepository.findByName(name);
    }

    public Book getBookByName(String name)
    {
        return bookRepository.findByName(name);
    }
}
