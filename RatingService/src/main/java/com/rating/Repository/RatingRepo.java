package com.rating.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rating.Rating.entities.Rating;

public interface RatingRepo extends JpaRepository<Rating, String> {
     
	// custom find methods
	List<Rating> findByUserId(String userId);
	List<Rating> findByHotelId(String hotelId);
}
