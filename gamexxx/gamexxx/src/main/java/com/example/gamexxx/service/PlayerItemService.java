package com.example.gamexxx.service;

import com.example.gamexxx.entity.Item;
import com.example.gamexxx.entity.Player;
import com.example.gamexxx.entity.PlayerItem;
import com.example.gamexxx.repository.ItemRepository;
import com.example.gamexxx.repository.PlayerItemRepository;
import com.example.gamexxx.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerItemService {

    @Autowired
    private PlayerItemRepository playerItemRepository;

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private ItemRepository itemRepository;

    public boolean savePlayerItem(PlayerItem playerItem) {
        Player player = playerRepository.findById(playerItem.getPlayer().getPlayerId())
                .orElseThrow(() -> new RuntimeException("Player not found"));
        Item item = itemRepository.findById(playerItem.getItem().getItemId())
                .orElseThrow(() -> new RuntimeException("Item not found"));

        playerItem.setPlayer(player);
        playerItem.setItem(item);

        playerItemRepository.save(playerItem);
        return true;
    }
}
