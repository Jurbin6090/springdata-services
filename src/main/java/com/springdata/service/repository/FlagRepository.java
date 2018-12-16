package com.springdata.service.repository;

import com.springdata.service.entity.Flag;
import org.springframework.data.repository.CrudRepository;

public interface FlagRepository extends CrudRepository<Flag, Integer> {
}
