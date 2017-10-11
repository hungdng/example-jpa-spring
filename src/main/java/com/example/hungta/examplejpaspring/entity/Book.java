package com.example.hungta.examplejpaspring.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "book")
public class Book {
    private Long id;
    private String name;
    private List<Author> authors;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany
    @JoinTable(name = "book_author",
            joinColumns = {
                    @JoinColumn(name = "fk_book")
            }, inverseJoinColumns = {
                @JoinColumn(name = "fk_author")
            }
    )
    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
}
