package com.zrjstudy.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: Zhang Ren Jie
 * @date: 2021-01-12 15:03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonRsult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonRsult(Integer code,String message) {
        this(code,message,null);
    }

}