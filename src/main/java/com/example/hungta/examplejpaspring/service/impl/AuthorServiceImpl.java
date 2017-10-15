package com.example.hungta.examplejpaspring.service.impl;

import com.example.hungta.examplejpaspring.entity.Author;
import com.example.hungta.examplejpaspring.repository.AuthorRepository;
import com.example.hungta.examplejpaspring.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public Author getAuthorById(Long aLong) {
        return authorRepository.findOne(aLong);
    }
}
