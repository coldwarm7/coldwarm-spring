package com.dharma.rest.model;

import javax.persistence.*;

/**
 * Created by Coldwarm on 18/5/16.
 */
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Double price;
    //private Integer count;

    public Product(){
        id = 0;
    }

    public Product(long id, String name, Double price) { //, Integer count
        this.id = id;
        this.name = name;
        this.price = price;
        //this.count = count;
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

//    public Integer getCount() {
//        return count;
//    }
//
//    public void setCount(Integer count) {
//        this.count = count;
//    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (id != other.id){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Product <id = " + id + ",name = " + name + ", price = "+ price;         //+ ",count = " + count ;
    }
    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ ( id >>> 32));
        return result;
    }
}
