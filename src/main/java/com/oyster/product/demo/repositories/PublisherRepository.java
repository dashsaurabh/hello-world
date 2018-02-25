package com.oyster.product.demo.repositories;

import com.oyster.product.demo.model.Author;
import com.oyster.product.demo.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
