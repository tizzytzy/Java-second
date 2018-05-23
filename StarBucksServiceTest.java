package com.qingguatang;

import java.util.ArrayList;

public class StarBucksServiceTest {


    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList();
        Product product = new Product("C罗");
        product.setPrice(100);

        Product product1 = new Product("梅西");
        product1.setPrice(90);

        Product product2 = new Product("齐达内");
        product2.setPrice(95);

        products.add(product);
        products.add(product1);
        products.add(product2);



        ArrayList<StarBucks> starBucks = new ArrayList();
        StarBucks s = new StarBucks("杭州");
        s.setProducts(products);


        StarBucks s1 = new StarBucks("上海");
        s1.setProducts(products);


        StarBucks s2 = new StarBucks("南京");
        s2.setProducts(products);


        StarBucksServiceimpl starBucksServiceimpl = new StarBucksServiceimpl();
        starBucksServiceimpl.setStarBucks(starBucks);



        starBucksServiceimpl.getMenu("上海");

    }

}
