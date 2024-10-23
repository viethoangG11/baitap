package com.example.gamexxx.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "item_type_t")
public class ItemType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_type_id")
    private int itemTypeId;

    @Column(name = "item_type_name", length = 50)
    private String itemTypeName;

    @OneToMany(mappedBy = "itemType", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Item> items;

    public ItemType() {
    }

    public int getItemTypeId() {
        return itemTypeId;
    }

    public void setItemTypeId(int itemTypeId) {
        this.itemTypeId = itemTypeId;
    }

    public String getItemTypeName() {
        return itemTypeName;
    }

    public void setItemTypeName(String itemTypeName) {
        this.itemTypeName = itemTypeName;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
