package com.example.jpapractise.service;

import com.example.jpapractise.Book;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookService {
    Book addBook(Book book);
    List<Book> getAll();
    List<Book> getByAuthor(String author);
    List<Book> getByCategory(String category);
    Book findById(int id);
    void updateBook(int bookId,double price);
    void deleteBook(int bookId);

}
