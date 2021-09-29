package com.spring.puzzle.class3.example2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class StudentController {

    private List<Student> students;

    public StudentController(List<Student> students){
        this.students = students;
    }

    /**
     * 使用注解注入的时候区别名字  students  和 student
     *     @Resource
     *     private List<Student> students;  注入的已经存在的bean（本身就是list）
     *
     *     和
     *         @Resource
     *     private List<Student> student;   注入的是Student bean  组成的list
     *
     * 使用构造器注入的是Student bean  组成的list,不区别名字
     *
     */

    @RequestMapping(path = "students", method = RequestMethod.GET)
    public String listStudents(){
       return students.toString();
    };

}
