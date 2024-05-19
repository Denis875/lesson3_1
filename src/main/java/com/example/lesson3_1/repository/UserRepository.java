package com.example.lesson3_1.repository;


import com.example.lesson3_1.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
