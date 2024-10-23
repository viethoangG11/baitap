package com.example.gamexxx.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "player_t")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id")
    private int playerId;

    @Column(name = "player_name", length = 120)
    private String playerName;

    @Column(name = "player_national", length = 50)
    private String playerNational;

    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PlayerItem> playerItems;

    public Player() {
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerNational() {
        return playerNational;
    }

    public void setPlayerNational(String playerNational) {
        this.playerNational = playerNational;
    }

    public List<PlayerItem> getPlayerItems() {
        return playerItems;
    }

    public void setPlayerItems(List<PlayerItem> playerItems) {
        this.playerItems = playerItems;
    }
}
