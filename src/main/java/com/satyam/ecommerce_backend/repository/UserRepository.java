package com.satyam.ecommerce_backend.repository;

import com.satyam.ecommerce_backend.model.Order;
import com.satyam.ecommerce_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User ,Long> {
    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);
}
