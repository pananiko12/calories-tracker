package com.pannik.tracker.controllers;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.pannik.tracker.entities.Food;
import com.pannik.tracker.repository.FoodRepository;

@RequestMapping("/api/test/all")
@RestController
public class FoodController {

	FoodRepository foodRepo;

	public FoodController(FoodRepository foodRepo) {
		super();
		this.foodRepo = foodRepo;
	}

	@GetMapping("/foods")
	Collection<Food> foods() {
		return foodRepo.findAll();
	}

	@GetMapping("/food/{id}")
	ResponseEntity<?> getFood(@PathVariable Integer id) {
		Optional<Food> food = foodRepo.findById(id);
		return food.map(response -> ResponseEntity.ok().body(response))
				.orElse(new ResponseEntity<Food>(HttpStatus.NOT_FOUND));
	}

	@PostMapping("/food")
	ResponseEntity<Food> createFood(@RequestBody Food food) throws URISyntaxException {
		Food result = foodRepo.save(food);
		return ResponseEntity.created(new URI("/api/test/all/food" + result.getFid())).body(result);
	}
	@PutMapping("/food/{id}")
	ResponseEntity<Food> updateFood(@RequestBody Food food){
		Food result = foodRepo.save(food);
		return ResponseEntity.ok().body(result);
	}
	
	@DeleteMapping("/food/{id}")
	ResponseEntity<?> deleteFood(@PathVariable Integer id){
		foodRepo.deleteById(id);
		return ResponseEntity.ok().build();
	}
}
