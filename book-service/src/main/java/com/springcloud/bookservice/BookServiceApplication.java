package com.springcloud.bookservice;

import com.springcloud.bookservice.model.Book;
import com.springcloud.bookservice.service.BookService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookServiceApplication {

    private final BookService bookService;

    @Autowired
    public BookServiceApplication(BookService bookService) {
        this.bookService = bookService;
    }

    public static void main(String[] args) {
        SpringApplication.run(BookServiceApplication.class, args);
    }

    @PostConstruct
    public void seed(){
        for (int i = 1; i < 11; i++) {
            bookService.addOne(new Book(i, "Book " + i, "Author " + i));
        }
    }
}
