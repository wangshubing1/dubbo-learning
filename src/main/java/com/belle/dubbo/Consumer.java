package com.belle.dubbo;

import com.belle.dubbo.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: king
 * @Date: 2019-11-19
 * @Desc: TODO
 */

public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/consumer.xml");
        context.start();
        DemoService providerService = (DemoService) context.getBean("demoService");
        String str = providerService.sayHello("hehe");
        System.out.println(str);

    }
}
