package com.belle.dubbo.impl;

import com.belle.dubbo.service.DemoService;


/**
 * @Author: king
 * @Date: 2019-11-14
 * @Desc: TODO
 */

public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        String hello = "hello "+ name;
        System.out.println(hello);
        return hello;
    }
}
