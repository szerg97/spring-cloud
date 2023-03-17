package com.springcloud.ratingservice.repository;

import com.springcloud.ratingservice.model.Rating;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RatingRepository {

    private final List<Rating> ratings = new ArrayList<>();

    public List<Rating> getAll(){
        return ratings;
    }

    public Rating getOne(long id){
        return ratings.stream()
                .filter(b -> b.getId() == id)
                .findFirst()
                .orElseThrow();
    }

    public int addOne(Rating rating){
        ratings.add(rating);
        return 1;
    }
}
