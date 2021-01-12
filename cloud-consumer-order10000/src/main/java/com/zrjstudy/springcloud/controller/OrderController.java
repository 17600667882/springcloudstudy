package com.zrjstudy.springcloud.controller;

import com.zrjstudy.springcloud.entities.CommonRsult;
import com.zrjstudy.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: Zhang Ren Jie
 * @date: 2021-01-12 16:01
 */
@RestController
public class OrderController {

    public static final String PAYMENT_URL = "http://localhost:10001";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/add")
    public CommonRsult<Payment> add(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/add",payment,CommonRsult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonRsult<Payment> get(@PathVariable("id") long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id,CommonRsult.class);
    }
}