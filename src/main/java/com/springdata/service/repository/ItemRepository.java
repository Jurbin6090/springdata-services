package com.springdata.service.repository;

import com.springdata.service.entity.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Integer>{

}
