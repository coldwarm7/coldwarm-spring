package com.dharma.rest.service;

/**
 * Created by Coldwarm on 18/5/16.
 */

import com.dharma.rest.model.Product;
import com.dharma.rest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    @Transactional
    public List<Product> getAllProducts() {
        return (List<Product>) productRepository.findAll();
    }

    @Transactional
    public Optional<Product> getById(Long id) {
        return productRepository.findById(id);
    }

    @Transactional
    public Optional<Product> deleteProduct(Long ProductId) {
        productRepository.delete(ProductId);
        return null;
    }

    @Transactional
    public boolean addProduct(Product product) {
        return productRepository.save(product) != null;
    }

    @Transactional
    public boolean updateProduct(Product product) {
        return productRepository.save(product) != null;
    }

    @Transactional
    public Optional<Product> deleteAllProduct(){
        productRepository.deleteAll();
        return null;
    }
}
