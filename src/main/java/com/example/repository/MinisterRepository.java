package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.model.Minister;

public interface MinisterRepository extends JpaRepository<Minister, Integer> {
  Optional<String> findNameById(@Param("id") Integer id);
}