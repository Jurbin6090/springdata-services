package com.springdata.service.repository;

import com.springdata.service.entity.Detail;
import org.springframework.data.repository.CrudRepository;

public interface DetailRepository  extends CrudRepository<Detail, Integer> {
}
