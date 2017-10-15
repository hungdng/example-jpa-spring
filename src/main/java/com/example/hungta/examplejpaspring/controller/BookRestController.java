package com.example.hungta.examplejpaspring.controller;

import com.example.hungta.examplejpaspring.builder.BookBuilder;
import com.example.hungta.examplejpaspring.entity.Author;
import com.example.hungta.examplejpaspring.entity.Book;
import com.example.hungta.examplejpaspring.model.BookRequestParam;
import com.example.hungta.examplejpaspring.model.BookResponseParam;
import com.example.hungta.examplejpaspring.service.AuthorService;
import com.example.hungta.examplejpaspring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping("/api/v1/books")
public class BookRestController {

    @Autowired
    BookService bookService;

    @Autowired
    AuthorService authorService;

    //request all book
    @GetMapping
    public void getAllBook(){

    }

    //create book
    @PostMapping
    public ResponseEntity<?> createBook(@RequestBody BookRequestParam param){
        try {
            Book bookSave = bookService.getBookById(param.getId());
            if (bookSave!=null)
                return ResponseEntity.status(HttpStatus.CONFLICT).build();

            Author author = authorService.getAuthorById(new Long(1));
            Book book = BookBuilder.aBook()
                    .withId(param.getId())
                    .withName(param.getName())
                    .withAuthors(Arrays.asList(author))
                    .build();
            Book saveBook = bookService.saveBook(book);

            BookResponseParam bookResponseParam = BookResponseParam
                    .BookResponseParamBuilder
                    .aBookResponseParam()
                    .withId(String.valueOf(saveBook.getId()))
                    .withName(saveBook.getName())
                    .withAuthorName(author.getName())
                    .build();

            return ResponseEntity.status(HttpStatus.CREATED).body(bookResponseParam);
        }catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }


    // remove book
    @DeleteMapping
    public void deleteBook(){

    }
}
