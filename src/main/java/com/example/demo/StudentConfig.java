package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
     public Students currentStudents() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1l, "Sean"));
        studentList.add(new Student(2l, "Alexander"));
        studentList.add(new Student(3l, "MacLaughlin"));
        return new Students(studentList);
    }

    @Bean(name = "previousStudents")
    public Students previousStudents() {
    List<Student> previousStudentList = new ArrayList<>();
        previousStudentList.add(new Student(4l, "John"));
        previousStudentList.add(new Student(5l, "Jacob"));
        previousStudentList.add(new Student(6l, "Jingle-Heimer"));
        previousStudentList.add(new Student(7l, "Smith"));

        return new Students(previousStudentList);
    }


}