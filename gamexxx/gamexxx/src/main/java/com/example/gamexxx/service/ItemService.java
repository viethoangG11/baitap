package com.example.gamexxx.service;

import com.example.gamexxx.entity.Item;
import com.example.gamexxx.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public boolean saveItem(Item item) {
        itemRepository.save(item);
        return true;
    }
}