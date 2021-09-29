package com.spring.puzzle.others.data.example3.application.application;

import com.spring.puzzle.others.data.example3.application.otherpackage.BaseConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config extends BaseConfig {

    @Bean
    public MyService service2(){
        return new MyService("myservice defined from config");
    }
    /**
     * 使用 继承的方式可以使超类的bean也被初始化
     */
}
