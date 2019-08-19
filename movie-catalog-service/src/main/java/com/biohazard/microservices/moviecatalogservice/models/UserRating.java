package com.biohazard.microservices.moviecatalogservice.models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter @NoArgsConstructor
public class UserRating {

    private List<Rating> userRating;

}
