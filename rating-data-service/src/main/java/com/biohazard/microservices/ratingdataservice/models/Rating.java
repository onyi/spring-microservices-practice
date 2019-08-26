package com.biohazard.microservices.ratingdataservice.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotNull(message = "Rating number cannot be blank!")
    @Range(min = 1, max = 5, message = "Rating should be from 1 to 5.")
    private Integer rating;

    @Column
    @NotNull(message = "Movie ID is required!")
    private Integer movieId;

    public Rating(Integer movieId, Integer rating) {
        this.movieId = movieId;
        this.rating = rating;
    }


}