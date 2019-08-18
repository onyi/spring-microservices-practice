package com.biohazard.microservices.movieinfoservice.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Movie {
    private String name;
    private String movieId;


    public Movie(String movieId, String name) {
        this.name = name;
        this.movieId = movieId;
    }
    
}