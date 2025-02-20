package com.example.shop.repository;

import com.example.shop.entity.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findByUsernameAndStatus(String username, String status);
    List<User> findByStatus(String status);
    User findByIdAndStatus(Long id, String status);
}
