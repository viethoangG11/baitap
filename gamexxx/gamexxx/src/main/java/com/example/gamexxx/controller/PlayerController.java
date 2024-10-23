package com.example.gamexxx.controller;

import com.example.gamexxx.entity.Player;
import com.example.gamexxx.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @PostMapping
    public ResponseEntity<?> createPlayer(@RequestBody Player player) {
        boolean status = playerService.savePlayer(player);
        return ResponseEntity.ok("{\"Status\": \"True\", \"ErrorCode\": \"200\"}");
    }
}