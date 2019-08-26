package com.biohazard.microservices.ratingdataservice.resources;

import java.util.Arrays;
import java.util.Collections;

import com.biohazard.microservices.ratingdataservice.models.UserRating;
import com.biohazard.microservices.ratingdataservice.repositories.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.biohazard.microservices.ratingdataservice.models.Rating;

import javax.validation.Valid;
import java.util.List;

@RestController
public class RatingResource {

    @Autowired
    RatingRepository ratingRepository;

    @GetMapping(path = "ratings/{movieId}")
    public Rating getRating(@PathVariable("movieId") Integer movieId){
//        return Collections.singletonList(
//            new Rating("1", 5)
//        );
        return new Rating(movieId, 5);
    }


    @GetMapping(path = "ratings/users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId){
        List<Rating> ratings = Arrays.asList(
                new Rating(1234, 5),
                new Rating(5678, 4)
        );
        UserRating userRating = new UserRating();
        userRating.setUserRating(ratings);
        return userRating;
    }

    @PostMapping(path = "ratings")
    public Rating createRating(@Valid @RequestBody Rating rating){

        return ratingRepository.save(rating);
    }


}