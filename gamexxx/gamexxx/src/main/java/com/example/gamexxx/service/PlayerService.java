package com.example.gamexxx.service;

import com.example.gamexxx.entity.Player;
import com.example.gamexxx.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public boolean savePlayer(Player player) {
        playerRepository.save(player);
        return true;
    }
}
