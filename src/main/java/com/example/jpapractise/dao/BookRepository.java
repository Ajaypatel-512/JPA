package com.example.jpapractise.dao;

import com.example.jpapractise.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book,Integer> {


}
