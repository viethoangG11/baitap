package com.example.gamexxx.controller;

import com.example.gamexxx.repository.PlayerItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/playerinfo")
public class PlayerInfoController {

    @Autowired
    private PlayerItemRepository playerItemRepository;

    @GetMapping
    public List<?> getPlayerInfo() {
        return playerItemRepository.findAll().stream().map(playerItem -> {
            return new Object() {
                public final String playerId = String.valueOf(playerItem.getPlayer().getPlayerId());
                public final String playerName = playerItem.getPlayer().getPlayerName();
                public final String playerNational = playerItem.getPlayer().getPlayerNational();
                public final String itemName = playerItem.getItem().getItemName();
                public final String price = playerItem.getItem().getPrice().toString();
                public final String itemTypeName = playerItem.getItem().getItemType().getItemTypeName();
            };
        }).collect(Collectors.toList());
    }
}