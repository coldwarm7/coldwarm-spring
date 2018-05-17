package com.dharma.rest.service;

/**
 * Created by Coldwarm on 18/5/16.
 */
import com.dharma.rest.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
@Transactional
public class ProductService implements IProductService{
    private static List<Product> products;

    private static final AtomicLong counter = new AtomicLong();

    static {
        products = initData();
    }

    @Override
    public List<Product> getProducts() {
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

    public Product getProductByName(String name){
        for (Product p : products){
            if (p.getName().equalsIgnoreCase(name)){
                return p;
            }
        }
        return null;
    }

    @Override
    public void addProduct(Product product) {
        product.setId(counter.incrementAndGet());
        products.add(product);
    }

    @Override
    public void updateProduct(Product product) {
        int index = products.indexOf(product);
        products.set(index,product);
    }

    @Override
    public void deleteProductById(long id) {
        for (Iterator<Product> iterator = products.iterator(); iterator.hasNext(); ){
            Product p = iterator.next();
            if (p.getId() == id){
                iterator.remove();
            }
        }
    }

    @Override
    public void deleteAllProducts() {
        products.clear();
    }

    @Override
    public boolean isProductExist(Product product) {
        return getProductByName(product.getName()) !=null;
    }

    private static List<Product> initData(){
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1,"Hammer",8848.0,1));
        products.add(new Product(2,"IphoneX",1.0,100));
        products.add(new Product(3,"P20",4848.0,1000));
        products.add(new Product(4,"R21",3999.0,10000));
        products.add(new Product(5,"Mix2S",3499.0,100000));

        return products;
    }
}
