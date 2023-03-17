package com.springcloud.ratingservice;

import com.springcloud.ratingservice.model.Rating;
import com.springcloud.ratingservice.service.RatingService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class RatingServiceApplication {

    private final RatingService ratingService;

    @Autowired
    public RatingServiceApplication(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    public static void main(String[] args) {
        SpringApplication.run(RatingServiceApplication.class, args);
    }

    @PostConstruct
    public void seed(){
        for (int i = 1; i < 11; i++) {
            ratingService.addOne(new Rating(i, (i / 2) + 1, new Random().nextInt(1, 6)));
        }
    }
}
