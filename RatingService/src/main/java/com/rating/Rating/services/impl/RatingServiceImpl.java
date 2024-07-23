package com.rating.Rating.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rating.Rating.entities.Rating;
import com.rating.Rating.services.RatingService;
import com.rating.Repository.RatingRepo;

public class RatingServiceImpl implements RatingService {
   
	@Autowired
	private RatingRepo repository;
	
	
	@Override
	public Rating create(Rating rating) {
		return repository.save(rating);
	}

	
	
	@Override
	public List<Rating> getRatings() {
		return repository.findAll();
	}

	
	
	@Override
	public List<Rating> getRatingByUserId(String userId) {
		return repository.findByUserId(userId);
	}

	
	
	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		return repository.findByHotelId(hotelId);
	}
    
}
