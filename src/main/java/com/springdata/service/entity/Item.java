package com.springdata.service.entity;

import javax.persistence.*;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String chatLink;
    int defaultSkin;
    String description;
    @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "item")
    private Detail detail;
    @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "item")
    Flag flag;
    String icon;
    int level;
    String name;
    String rarity;
    String type;
    int vendorValue;

    public Item() {
    }

    public Item(String chatLink, int defaultSkin, String description, Detail detail, Flag flag, String icon, int level, String name, String rarity, String type, int vendorValue) {
        this.chatLink = chatLink;
        this.defaultSkin = defaultSkin;
        this.description = description;
        this.detail = detail;
        this.flag = flag;
        this.icon = icon;
        this.level = level;
        this.name = name;
        this.rarity = rarity;
        this.type = type;
        this.vendorValue = vendorValue;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChatLink() {
        return chatLink;
    }

    public void setChatLink(String chatLink) {
        this.chatLink = chatLink;
    }

    public int getDefaultSkin() {
        return defaultSkin;
    }

    public void setDefaultSkin(int defaultSkin) {
        this.defaultSkin = defaultSkin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    public Flag getFlag() {
        return flag;
    }

    public void setFlag(Flag flag) {
        this.flag = flag;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getVendorValue() {
        return vendorValue;
    }

    public void setVendorValue(int vendorValue) {
        this.vendorValue = vendorValue;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", chatLink='" + chatLink + '\'' +
                ", defaultSkin=" + defaultSkin +
                ", description='" + description + '\'' +
                ", detail=" + detail +
                ", flag=" + flag +
                ", icon='" + icon + '\'' +
                ", level=" + level +
                ", name='" + name + '\'' +
                ", rarity='" + rarity + '\'' +
                ", type='" + type + '\'' +
                ", vendorValue=" + vendorValue +
                '}';
    }
}
