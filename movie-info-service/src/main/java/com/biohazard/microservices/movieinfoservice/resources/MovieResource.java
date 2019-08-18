package com.biohazard.microservices.movieinfoservice.resources;

import java.util.Collections;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.biohazard.microservices.movieinfoservice.models.Movie;

@RestController
@RequestMapping("/movies")

public class MovieResource {

    @RequestMapping("{movieId}")
    public Movie getMovie(@PathVariable("movieId") String movieId){
//        return Collections.singletonList(
//            new Movie(movieId, "Hi")
//        );
        return new Movie(movieId, "Hi");
    }
}

