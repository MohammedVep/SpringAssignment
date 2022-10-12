package com.example.services;

import com.example.model.Food;

import java.util.Set;

public interface FoodService {
    Food findById(Long id);
    Food save(Food food);
    Food remove(Food food);
    Set<Food> findAll();
}
