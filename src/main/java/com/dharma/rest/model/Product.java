package com.dharma.rest.model;

/**
 * Created by Coldwarm on 18/5/16.
 */
public class Product {
    private long id;
    private String name;
    private Double price;
    private Integer count;

    public Product(){
        id = 0;
    }

    public Product(long id, String name, Double price, Integer count) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Product me = (Product) obj;
//        if (id != me.id){
//            return false;
//        }
        return id ==me.id;
    }

    @Override
    public String toString() {
        return "Product <id = " + id + ",name = " + name +
                ", price = "+ price + ",count = " + count ;
    }
}
