package com.yaswanth.demo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yaswanth.demo.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUserName(String username);
}
