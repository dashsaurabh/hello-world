package com.oyster.product.demo.repositories;

import com.oyster.product.demo.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {


}
