package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Campaign;

public interface CampRepo extends JpaRepository<Campaign, Long> {
}
