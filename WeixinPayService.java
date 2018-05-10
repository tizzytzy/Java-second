package com.qingguatang;

public class WeixinPayService implements PayService {
    @Override
    public void pay(String orderId, double price) {

        System.out.println(orderId + ":" + price);

    }
}
