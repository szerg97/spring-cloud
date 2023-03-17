package com.springcloud.bookservice.controller;

import com.springcloud.bookservice.model.Book;
import com.springcloud.bookservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/book-service")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("")
    public List<Book> getAll(){
        return bookService.getAll();
    }

    @GetMapping("/{id}")
    public Book getOne(@PathVariable long id){
        return bookService.getOne(id);
    }

    @PostMapping("")
    public int addOne(@RequestBody Book book){
        return bookService.addOne(book);
    }
}
