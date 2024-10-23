package com.example.gamexxx.controller;


import com.example.gamexxx.entity.PlayerItem;
import com.example.gamexxx.service.PlayerItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/playerbuyitem")
public class PlayerItemController {

    @Autowired
    private PlayerItemService playerItemService;

    @PostMapping
    public ResponseEntity<?> createPlayerItem(@RequestBody PlayerItem playerItem) {
        boolean status = playerItemService.savePlayerItem(playerItem);
        return ResponseEntity.ok("{\"Status\": \"True\", \"ErrorCode\": \"200\"}");
    }
}

