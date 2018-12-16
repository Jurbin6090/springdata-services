package com.springdata.service.controller;

import com.springdata.service.entity.Detail;
import com.springdata.service.entity.Flag;
import com.springdata.service.entity.Item;
import com.springdata.service.repository.DetailRepository;
import com.springdata.service.repository.FlagRepository;
import com.springdata.service.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class GuildWarsController {
    @Autowired
    ItemRepository itemRepository;

    @Autowired
    DetailRepository detailRepository;

    @Autowired
    FlagRepository flagRepository;

    @GetMapping("/item")
    public List<Item> getItems() {
        return (List<Item>) itemRepository.findAll();
    }

    @PostMapping("/item")
    public Item addItem(@RequestBody Item item) {
        return itemRepository.save(item);
    }

    @GetMapping("/detail")
    public List<Detail> getDetails() {
        return (List<Detail>) detailRepository.findAll();
    }

    @PostMapping("/detail")
    public Detail addDetail(@RequestBody Detail detail) {
        addItem(detail.getItem());
        return detailRepository.save(detail);
    }

    @GetMapping("/flag")
    public List<Flag> getFlags() {
        return (List<Flag>) flagRepository.findAll();
    }

    @PostMapping("/flag")
    public Flag addFlag(@RequestBody Flag flag) {
        addItem(flag.getItem());
        return flagRepository.save(flag);
    }
}
