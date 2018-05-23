package com.qingguatang;

import java.util.ArrayList;

public class StarBucks {

    private String location;
    ArrayList<Product> products;
    public StarBucks(){}

    public StarBucks (String location){


    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }


}
