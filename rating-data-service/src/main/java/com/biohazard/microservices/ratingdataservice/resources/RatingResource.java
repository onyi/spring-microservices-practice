package com.biohazard.microservices.ratingdataservice.resources;

import java.util.Collections;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biohazard.microservices.ratingdataservice.models.Rating;

import java.util.List;

@RestController
@RequestMapping("/rating")

public class RatingResource {

    @RequestMapping("{movieId}")
    public List<Rating> getRating(@PathVariable("movieId") String movieId){
        return Collections.singletonList(
            new Rating("1", 5)
        );
    }


}