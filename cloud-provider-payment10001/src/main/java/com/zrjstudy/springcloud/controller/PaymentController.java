package com.zrjstudy.springcloud.controller;

import com.zrjstudy.springcloud.entities.CommonRsult;
import com.zrjstudy.springcloud.entities.Payment;
import com.zrjstudy.springcloud.serivce.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author: Zhang Ren Jie
 * @date: 2021-01-12 15:23
 */
@RestController
@Slf4j
@EnableEurekaClient
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("payment/add")
    public CommonRsult add(@RequestBody Payment payment) {
        int result = paymentService.add(payment);
        System.out.println("11");
        log.info("****插入结果：" + result);
        return result > 0 ? new CommonRsult(200,"插入成功",payment) : new CommonRsult(403,"插入成功");
    }

    @GetMapping("payment/get/{id}")
    public CommonRsult getPaymentByid(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("****查询结果：" + payment);
        return payment != null ? new CommonRsult(200,"查询成功",payment) : new CommonRsult(403,"查询失败");
    }
}