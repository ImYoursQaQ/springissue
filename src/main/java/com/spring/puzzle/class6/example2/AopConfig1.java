package com.spring.puzzle.class6.example2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Aspect
@Service
@Order(3)
public class AopConfig1 {

    @Before("execution(* com.spring.puzzle.class6.example2.ElectricService.charge()) ")
    public void validateAuthority(JoinPoint pjp) throws Throwable {
        System.out.println("myOrder: 3");
    }
}