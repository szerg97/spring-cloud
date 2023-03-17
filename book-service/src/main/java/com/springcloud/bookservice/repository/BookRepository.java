package com.springcloud.bookservice.repository;

import com.springcloud.bookservice.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookRepository {

    private final List<Book> books = new ArrayList<>();

    public List<Book> getAll(){
        return books;
    }

    public Book getOne(long id){
        return books.stream()
                .filter(b -> b.getId() == id)
                .findFirst()
                .orElseThrow();
    }

    public int addOne(Book book){
        books.add(book);
        return 1;
    }
}
