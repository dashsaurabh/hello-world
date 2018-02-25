package com.oyster.product.demo.repositories;

import com.oyster.product.demo.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
