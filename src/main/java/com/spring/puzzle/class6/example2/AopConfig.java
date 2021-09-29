package com.spring.puzzle.class6.example2;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class AopConfig {

//    @Before("execution(* com.spring.puzzle.class6.example2.ElectricService.charge()) ")
//    public void validateAuthority(JoinPoint pjp) throws Throwable {
//        throw new RuntimeException("authority check failed");
//    }
//    @Before("execution(* com.spring.puzzle.class6.example2.ElectricService.charge())")
//    public void logBeforeMethod(JoinPoint pjp) throws Throwable {
//        System.out.println("step into ->"+pjp.getSignature());
//    }
//
//    @Before("execution(* com.spring.puzzle.class6.example2.ElectricService.charge())")
//    public void zlogBeforeMethod(JoinPoint pjp) throws Throwable {
//        System.out.println("my aaa step into ->"+pjp.getSignature());
//    }

    /**
     * 切面的默认顺序是（方法）名字的字典顺序
     * 如果有order注解 从小到大优先级越高。优先级越高意味着先进、后出
     */
}

