package com.biohazard.microservices.ratingdataservice.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private int rating;

    @Column(nullable = false)
    private String movieId;

    public Rating(String movieId, int rating) {
        this.movieId = movieId;
        this.rating = rating;
    }


}