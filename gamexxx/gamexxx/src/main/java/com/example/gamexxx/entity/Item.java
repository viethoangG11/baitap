package com.example.gamexxx.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

import java.util.List;

@Entity
@Table(name = "item_t")
public class Item {

    @Id
    @Column(name = "item_id", length = 10)
    private String itemId;

    @Column(name = "item_name", length = 120)
    private String itemName;

    @Column(name = "price", precision = 21, scale = 6)
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "item_type_id", referencedColumnName = "item_type_id")
    private ItemType itemType;

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PlayerItem> playerItems;

    public Item() {
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public List<PlayerItem> getPlayerItems() {
        return playerItems;
    }

    public void setPlayerItems(List<PlayerItem> playerItems) {
        this.playerItems = playerItems;
    }
}
