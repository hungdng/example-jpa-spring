package com.example.hungta.examplejpaspring.service.impl;

import com.example.hungta.examplejpaspring.entity.Book;
import com.example.hungta.examplejpaspring.repository.BookRepository;
import com.example.hungta.examplejpaspring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public Book saveBook(Book book) {
        return bookRepository.saveAndFlush(book);
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepository.findOne(id);
    }
}
