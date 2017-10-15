package com.example.hungta.examplejpaspring.repository;

import com.example.hungta.examplejpaspring.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
