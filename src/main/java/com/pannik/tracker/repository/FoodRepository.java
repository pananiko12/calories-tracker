package com.pannik.tracker.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pannik.tracker.entities.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Integer>{
	Optional<Food> findByName(String name);
}
