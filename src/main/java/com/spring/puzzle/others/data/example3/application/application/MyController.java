package com.spring.puzzle.others.data.example3.application.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author teohubo
 */
@RestController
public class MyController {

    @Resource
    private List<MyService> myServices;

    @GetMapping("/hello")
    public String testConfig(){
        System.out.println(myServices.toString());
        return "ok!";
    }
}
