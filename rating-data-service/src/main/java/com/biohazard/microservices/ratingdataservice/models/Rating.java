package com.biohazard.microservices.ratingdataservice.models;

public class Rating {

    private int rating;
    private String movieId;

    public Rating(String movieId, int rating) {
        this.movieId = movieId;
        this.rating = rating;
    }


}