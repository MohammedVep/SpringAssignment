package com.example.services.map;

import com.example.model.Food;
import com.example.services.CrudService;

import java.util.Set;

public class FoodMapService extends AbstractMapService<Food, Long> implements CrudService<Food, Long> {
    @Override
    public Set<Food> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Food object) {
        super.delete(object);
    }

    @Override
    public Food findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Food save(Food object) {
        return super.save(object.getId(), object);
    }
}
