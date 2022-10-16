package com.example.services.map;

import com.example.model.Planning;
import com.example.services.CrudService;

import java.util.Set;

public class PlanningMapService extends AbstractMapService<Planning, Long> implements CrudService<Planning, Long> {
    @Override
    public Set<Planning> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Planning object) {
        super.delete(object);
    }

    @Override
    public Planning save(Planning object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Planning findById(Long id) {
        return super.findById(id);
    }
}
