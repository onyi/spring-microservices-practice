package com.biohazard.microservices.ratingdataservice.resources;

import java.util.Arrays;
import java.util.Collections;

import com.biohazard.microservices.ratingdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biohazard.microservices.ratingdataservice.models.Rating;

import java.util.List;

@RestController
@RequestMapping("/ratings")

public class RatingResource {

    @RequestMapping("{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
//        return Collections.singletonList(
//            new Rating("1", 5)
//        );
        return new Rating(movieId, 5);
    }

    @RequestMapping("users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId){
        List<Rating> ratings = Arrays.asList(
                new Rating("1234", 5),
                new Rating("5678", 4)
        );
        UserRating userRating = new UserRating();
        userRating.setUserRating(ratings);
        return userRating;
    }


}