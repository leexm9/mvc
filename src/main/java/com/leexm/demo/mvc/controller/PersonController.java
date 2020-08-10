package com.leexm.demo.mvc.controller;

import com.leexm.demo.mvc.entity.Person;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @author leexm
 * @date 2020/8/5 9:38
 */
public class PersonController extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Tom", 20));
        persons.add(new Person("Jack", 30));
        return new ModelAndView("person", "persons", persons);
    }

}
