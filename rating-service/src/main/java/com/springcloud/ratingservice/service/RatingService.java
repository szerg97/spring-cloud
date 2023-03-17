package com.springcloud.ratingservice.service;

import com.springcloud.ratingservice.model.Rating;
import com.springcloud.ratingservice.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingService {

    private final RatingRepository ratingRepository;

    @Autowired
    public RatingService(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    public List<Rating> getAll(){
        return ratingRepository.getAll();
    }

    public Rating getOne(long id){
        return ratingRepository.getOne(id);
    }

    public int addOne(Rating rating){
        return ratingRepository.addOne(rating);
    }
}
