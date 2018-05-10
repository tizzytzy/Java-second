package com.qingguatang;

public class ZhifubaoPayservcie implements PayService {
    @Override
    public void pay(String orderId, double price) {

        System.out.println("支付宝支付：" + orderId + ":" + price);

    }
}
