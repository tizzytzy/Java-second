package com.qingguatang;

public class Product {

    private String name;
    private double price;

   public Product(){


   }

   public Product(String name){

       this.name = name;

   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
