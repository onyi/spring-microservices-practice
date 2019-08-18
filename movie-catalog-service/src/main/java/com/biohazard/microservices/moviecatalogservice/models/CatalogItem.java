package com.biohazard.microservices.moviecatalogservice.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class CatalogItem {

    private String name;
    private String desc;
    private int rating;
}
