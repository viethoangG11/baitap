package com.example.gamexxx.controller;

import com.example.gamexxx.entity.Item;
import com.example.gamexxx.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping
    public ResponseEntity<?> createItem(@RequestBody Item item) {
        boolean status = itemService.saveItem(item);
        return ResponseEntity.ok("{\"Status\": \"True\", \"ErrorCode\": \"200\"}");
    }
}