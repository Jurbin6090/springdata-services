package com.springdata.service.entity;

import javax.persistence.*;

@Entity
public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "item_id", nullable = false)
    Item item;
    int defense;
    int secondarySuffixItemId;
    String type;
    String weightClass;

    public Detail() {
    }

    public Detail(Item item, int defense, int secondarySuffixItemId, String type, String weightClass) {
        this.item = item;
        this.defense = defense;
        this.secondarySuffixItemId = secondarySuffixItemId;
        this.type = type;
        this.weightClass = weightClass;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSecondarySuffixItemId() {
        return secondarySuffixItemId;
    }

    public void setSecondarySuffixItemId(int secondarySuffixItemId) {
        this.secondarySuffixItemId = secondarySuffixItemId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWeightClass() {
        return weightClass;
    }

    public void setWeightClass(String weightClass) {
        this.weightClass = weightClass;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "id=" + id +
                ", item=" + item +
                ", defense=" + defense +
                ", secondarySuffixItemId=" + secondarySuffixItemId +
                ", type='" + type + '\'' +
                ", weightClass='" + weightClass + '\'' +
                '}';
    }
}
