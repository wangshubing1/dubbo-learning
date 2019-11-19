package com.belle.dubbo;




import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author: king
 * @Date: 2019-11-18
 * @Desc: TODO
 */

public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("META-INF/provider.xml");
        context.start();
        System.in.read(); // 按任意键退出
    }
}
