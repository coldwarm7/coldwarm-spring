package com.dharma.rest.repository;

import com.dharma.rest.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Coldwarm on 18/5/19.
 */
public interface ProductRepository<p> extends CrudRepository<Product,Long> {
    List<Product> findByName(String name);
}
