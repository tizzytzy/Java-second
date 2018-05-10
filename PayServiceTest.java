package com.qingguatang;

public class PayServiceTest {

    public static void main(String[] args) {

        PayService payService = new WeixinPayService();

        payService.pay("Jack Ma",100);

        payService = new ZhifubaoPayservcie();

        payService.pay("雷军",1000);

    }

}
