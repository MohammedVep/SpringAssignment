package com.example.services;

import com.example.model.Planning;

import java.util.Set;

public interface PlanningService {
    Planning findById(Long id);
    Planning save(Planning food);
    Planning remove(Planning food);
    Set<Planning> findAll();
}
