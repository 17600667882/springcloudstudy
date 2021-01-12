package com.zrjstudy.springcloud.serivce;

import com.zrjstudy.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @description:
 * @author: Zhang Ren Jie
 * @date: 2021-01-12 15:21
 */

public interface PaymentService {
    int add(Payment payment);

    Payment getPaymentById(long id);
}
