package com.spring.puzzle.class5.example1;

import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElectricService {

    @Autowired
    ElectricService electricService;

    /**
     * 使用自己注入自己实现代理方法执行
     *
     * 使用AopContext.currentProxy()获取代理类执行，需要配置 @EnableAspectJAutoProxy(exposeProxy = true)
     */

    public void charge() throws Exception {
        System.out.println("Electric charging ...");
//        this.pay();

         electricService.pay();

//        ElectricService electric = ((ElectricService) AopContext.currentProxy());
//        electric.pay();

    }

    public void pay() throws Exception {
        System.out.println("Pay with alipay ...");
        Thread.sleep(1000);
    }

}