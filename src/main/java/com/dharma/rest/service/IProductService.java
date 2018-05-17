package com.dharma.rest.service;

import com.dharma.rest.model.Product;

import java.util.List;

/**
 * Created by Coldwarm on 18/5/16.
 */
public interface IProductService {
    List<Product> getProducts();

    Product getProductById(long id);

    Product getProductByName(String name);

    void addProduct(Product product);

    void updateProduct(Product product);

    void deleteProductById(long id);

    void deleteAllProducts();

    public boolean isProductExist(Product product);
}
