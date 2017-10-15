package com.example.hungta.examplejpaspring.service;

import com.example.hungta.examplejpaspring.entity.Book;

public interface BookService {
    Book saveBook(Book book);

    Book getBookById(Long id);
}
