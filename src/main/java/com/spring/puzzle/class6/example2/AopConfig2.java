package com.spring.puzzle.class6.example2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Aspect
@Service
@Order(2)
public class AopConfig2 {

    @Before("execution(* com.spring.puzzle.class6.example2.ElectricService.charge())")
    public void logBeforeMethod(JoinPoint pjp) throws Throwable {
        System.out.println("myOrder: 2");
    }

}