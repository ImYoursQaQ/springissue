package com.spring.puzzle.web.filter.example3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.Filter;
import javax.servlet.FilterRegistration;
import java.util.List;
import java.util.Map;

@Controller
@Slf4j
public class StudentController {

    @Resource
    ApplicationContext applicationContext;

    @PostMapping("/regStudent/{name)}")
    @ResponseBody
    public String saveUser(String name) throws Exception {

        Map<String, Filter> beansOfType = applicationContext.getBeansOfType(Filter.class);
        System.out.println("......用户注册成功");
        return "success";
    }
}