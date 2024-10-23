package com.example.gamexxx.repository;

import com.example.gamexxx.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, String> {
}
