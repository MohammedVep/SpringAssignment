package com.example.services;

import com.example.model.User;

import java.util.Set;

public interface UserService {
    User findById(Long id);
    User save(User user);
    User remove(User user);
    Set<User> findAll();
}
