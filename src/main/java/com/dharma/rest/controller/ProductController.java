package com.dharma.rest.controller;

import com.dharma.rest.model.Product;
import com.dharma.rest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Created by Coldwarm on 18/5/16.
 */
@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<String> welcome(){
        return new ResponseEntity<String>("Welcome to coldwarm mall",HttpStatus.OK);
    }

    @RequestMapping(value = "/product",method = RequestMethod.GET)
    public @ResponseBody List<Product> getAll(){
        return productService.getAllProducts();
    }


    @RequestMapping(value = "/product/{id}",method = RequestMethod.GET)
    public @ResponseBody
    Optional<Product> getProduct(@PathVariable("id") Long id){
        return productService.getById(id);
    }

    @RequestMapping(value = "/product",method = RequestMethod.DELETE)
    public @ResponseBody  Optional<Product> deleteAllProduct(){
        return productService.deleteAllProduct();
    }

    @RequestMapping(value = "/product/{id}",method = RequestMethod.DELETE)
    public @ResponseBody Optional<Product> deleteProduct(@PathVariable("id") Long id){
        return productService.deleteProduct(id);
    }

    @RequestMapping(value = "/product",method = RequestMethod.PUT)
    public @ResponseBody
    boolean addProduct(Product product){
        return productService.addProduct(product);

    }

    @RequestMapping(value = "/product/",method = RequestMethod.PUT)
    public @ResponseBody
    boolean updateProduct(Product product){
        return productService.updateProduct(product);

    }
}


