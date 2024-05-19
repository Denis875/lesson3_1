package com.example.lesson3_1.service;


import com.example.lesson3_1.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    void delete(Long id);

    void update(User user);

    List<User> getAll();

    User getUserById(Long id);
}
