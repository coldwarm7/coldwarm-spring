package com.dharma.rest.controller;

import com.dharma.rest.model.Product;
import com.dharma.rest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Coldwarm on 18/5/16.
 */
@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/products/",method = RequestMethod.GET)
    public ResponseEntity<List<Product>> listProducts(){
        List<Product> products = productService.getProducts();
        if (products.isEmpty()){
            return new ResponseEntity<List<Product>>(products,HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Product>>(products,HttpStatus.OK);
    }
}
