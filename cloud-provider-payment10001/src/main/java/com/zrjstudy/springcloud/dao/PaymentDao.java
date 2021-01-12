package com.zrjstudy.springcloud.dao;

import com.zrjstudy.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @description:
 * @author: Zhang Ren Jie
 * @date: 2021-01-12 15:07
 */
@Mapper
public interface PaymentDao {
    int add(Payment payment);

    Payment getPaymentById(@Param("id") long id);
}
