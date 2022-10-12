package com.example.model;

public class Recipe {
    private String recipeName;
    private String allergins;
    private String ingredients;
    private String steps;

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getAllergins() {
        return allergins;
    }

    public void setAllergins(String allergins) {
        this.allergins = allergins;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }
}
