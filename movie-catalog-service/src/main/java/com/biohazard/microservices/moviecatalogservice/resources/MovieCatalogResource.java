package com.biohazard.microservices.moviecatalogservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.biohazard.microservices.moviecatalogservice.models.CatalogItem;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
        System.out.println("User Id: " + userId);
        return Collections.singletonList(
            new CatalogItem("helloworld", "Testing", 5)
        );
    }
}