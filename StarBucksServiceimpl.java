package com.qingguatang;

import java.util.ArrayList;

public class StarBucksServiceimpl implements StarBucksService {

     ArrayList<StarBucks>starBucks;

    public ArrayList<StarBucks> getStarBucks() {
        return starBucks;
    }

    public void setStarBucks(ArrayList<StarBucks> starBucks) {
        this.starBucks = starBucks;
    }




    @Override
    public ArrayList<Product> getMenu(String location) {
        for (StarBucks s : starBucks) {
            if (s.getProducts().equals(location)) {
                if (s.getProducts() == null) {

                    s.setProducts(new ArrayList<Product>());
                    System.out.println(s.getProducts());
                }


            }

        }

return null;
    }
}
