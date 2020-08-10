package com.leexm.demo.mvc.entity;

/**
 * @author leexm
 * @date 2020-08-09 09:21
 */
public class Student extends Person {

    private String teacher;

    public Student(String name, int age, String teacher) {
        super(name, age);
        this.teacher = teacher;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

}
