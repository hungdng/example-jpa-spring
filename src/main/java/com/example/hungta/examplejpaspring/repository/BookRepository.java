package com.example.hungta.examplejpaspring.repository;

import com.example.hungta.examplejpaspring.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
