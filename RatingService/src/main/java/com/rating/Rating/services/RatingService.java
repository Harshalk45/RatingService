package com.rating.Rating.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rating.Rating.entities.Rating;

@Service
public interface RatingService {
      
	//create
	Rating create(Rating rating);
	
	// get all ratings
	 List<Rating> getRatings();
	 
	
	// get all by userId
	List<Rating> getRatingByUserId(String userId);
	
	
	// get all by hotel
	List<Rating> getRatingByHotelId(String hotelId);
}

