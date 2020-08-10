package com.leexm.demo.mvc.controller;

import com.leexm.demo.mvc.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leexm
 * @date 2020-08-09 09:20
 */
@RestController
@RequestMapping("/stu")
public class StudentController {

    @GetMapping("/list")
    public List<Student> list() {
        List<Student> stus = new ArrayList<>();
        stus.add(new Student("Tom", 12, "Helen"));
        stus.add(new Student("Jack", 15, "Helen"));
        return stus;
    }

    @GetMapping("/show")
    public ModelAndView show() {
        List<Student> stus = new ArrayList<>();
        stus.add(new Student("Tom", 12, "Helen"));
        stus.add(new Student("Jack", 15, "Helen"));
        return new ModelAndView("student", "stus", stus);
    }


}
