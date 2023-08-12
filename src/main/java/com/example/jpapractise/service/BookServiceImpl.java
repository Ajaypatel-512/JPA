package com.example.jpapractise.service;

import com.example.jpapractise.Book;
import com.example.jpapractise.dao.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
    BookRepository bookRepository;

    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public List<Book> getByAuthor(String author) {
        return null;
    }

    @Override
    public List<Book> getByCategory(String category) {
        return null;
    }

    @Override
    public Book findById(int id) {
        Optional<Book> book = bookRepository.findById(id);
        if(book.isEmpty()){
            return book.get();
        }
//        bookRepository.findById(id).orElseThrow();

        return null;
    }

    @Override
    public void updateBook(int bookId, double price) {
        Book book = bookRepository.findById(bookId).get();
        book.setCost(price);
        bookRepository.save(book);
    }

    @Override
    public void deleteBook(int bookId) {
        bookRepository.deleteById(bookId);
    }
}
