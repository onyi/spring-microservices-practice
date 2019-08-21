package com.biohazard.microservices.ratingdataservice.repositories;

import com.biohazard.microservices.ratingdataservice.models.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Long> {

}
