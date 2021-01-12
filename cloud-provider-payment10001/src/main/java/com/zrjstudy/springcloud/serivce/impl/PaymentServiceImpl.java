package com.zrjstudy.springcloud.serivce.impl;

import com.zrjstudy.springcloud.dao.PaymentDao;
import com.zrjstudy.springcloud.entities.Payment;
import com.zrjstudy.springcloud.serivce.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: Zhang Ren Jie
 * @date: 2021-01-12 15:21
 */

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int add(Payment payment) {
        return paymentDao.add(payment);
    }

    @Override
    public Payment getPaymentById(long id) {
        return paymentDao.getPaymentById(id);
    }
}