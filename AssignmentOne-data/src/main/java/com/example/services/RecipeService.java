package com.example.services;

import com.example.model.Recipe;

import java.util.Set;

public interface RecipeService {
    Recipe findById(Long id);
    Recipe save(Recipe recipe);
    Recipe delete(Recipe recipe);
    Set<Recipe> findAll();
}
