package com.example.gamexxx.repository;

import com.example.gamexxx.entity.PlayerItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerItemRepository extends JpaRepository<PlayerItem, Integer> {
}