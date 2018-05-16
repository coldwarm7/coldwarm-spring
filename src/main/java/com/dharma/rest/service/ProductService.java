package com.dharma.rest.service;

/**
 * Created by Coldwarm on 18/5/16.
 */
import com.dharma.rest.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ProductService implements IProductService{
    private  List<Product> products;

    public ProductService(){
        products = initProducts();
    }
    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(long id){
        for (Product p : products){
            if (p.getId() == id){
                return p;
            }
        }
        return null;
    }

    private List<Product> initProducts(){
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1,"Hammer",8848.0,1));
        products.add(new Product(2,"IphoneX",1.0,100));
        products.add(new Product(3,"P20",4848.0,1000));
        products.add(new Product(4,"R21",3999.0,10000));
        products.add(new Product(5,"Mix2S",3499.0,100000));

        return products;
    }
}
