package com.springcloud.ratingservice.controller;

import com.springcloud.ratingservice.model.Rating;
import com.springcloud.ratingservice.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/rating-service")
public class RatingController {

    private final RatingService bookService;

    @Autowired
    public RatingController(RatingService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("")
    public List<Rating> getAll(){
        return bookService.getAll();
    }

    @GetMapping("/{id}")
    public Rating getOne(@PathVariable long id){
        return bookService.getOne(id);
    }

    @PostMapping("")
    public int addOne(@RequestBody Rating book){
        return bookService.addOne(book);
    }
}
