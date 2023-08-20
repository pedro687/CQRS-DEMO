package com.example.demo.repository;


import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<User, String> {
    Boolean existsByEmail(String email);
    Optional<User> findById(String id);
    Boolean existsByDocument(String email);
}
