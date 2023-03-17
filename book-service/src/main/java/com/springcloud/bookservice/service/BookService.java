package com.springcloud.bookservice.service;

import com.springcloud.bookservice.model.Book;
import com.springcloud.bookservice.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAll(){
        return bookRepository.getAll();
    }

    public Book getOne(long id){
        return bookRepository.getOne(id);
    }

    public int addOne(Book book){
        return bookRepository.addOne(book);
    }
}
