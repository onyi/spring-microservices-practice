package com.biohazard.microservices.moviecatalogservice.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Rating {

    private int rating;
    private String movieId;

    public Rating(String movieId, int rating) {
        this.movieId = movieId;
        this.rating = rating;
    }

}
