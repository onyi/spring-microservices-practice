package com.biohazard.microservices.moviecatalogservice.resources;

import com.biohazard.microservices.moviecatalogservice.models.Movie;
import com.biohazard.microservices.moviecatalogservice.models.Rating;
import com.biohazard.microservices.moviecatalogservice.models.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.biohazard.microservices.moviecatalogservice.models.CatalogItem;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    WebClient.Builder webClientBuilder;

    String MOVIE_SERVICE_URL = "http://localhost:8081/movies/";
    String RATING_SERVICE_URL = "http://localhost:8082/ratings/";

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
        System.out.println("User Id: " + userId);

        // Hardcode rating data for now
//        List<Rating> ratings = Arrays.asList(
//                new Rating("666", 5),
//                new Rating("1234", 4)
//        );

        UserRating ratings = restTemplate.getForObject(
                RATING_SERVICE_URL + userId,
                UserRating.class
        );


        return ratings.getUserRating().stream().map( rating -> {
            //For each movie ID, request Movie info from Movie Info service

//            Movie movie = webClientBuilder.build()
//                    .get()
//                    .uri(MOVIE_SERVICE_URL + rating.getMovieId())
//                    .retrieve()
//                    .bodyToMono(Movie.class)
//                    .block();

            Movie movie = restTemplate.getForObject(
                    MOVIE_SERVICE_URL + rating.getMovieId(), Movie.class);

            return new CatalogItem(movie.getName(), "Testing", rating.getRating());
        }).collect(Collectors.toList());

//        return Collections.singletonList(
//            new CatalogItem("helloworld", "Testing", 5)
//        );
    }
}