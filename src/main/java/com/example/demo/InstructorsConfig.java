package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class InstructorsConfig {

    @Bean(name = "tcUSAInstructors")
    public Instructors tcUSAInstructors() {
        List<Instructor> instructorList = new ArrayList<>();
        instructorList.add(new Instructor(11l, "Bill"));
        instructorList.add(new Instructor(12l, "Nye"));
        instructorList.add(new Instructor(13l, "Science-Guy"));
        return new Instructors(instructorList);
    }

    @Bean(name = "tcUKInstructors")
    public Instructors tcUKInstructors() {
        List<Instructor> ukInstructorList = new ArrayList<>();
        ukInstructorList.add(new Instructor(14l, "Posh"));
        ukInstructorList.add(new Instructor(15l, "Chesterfield"));
        ukInstructorList.add(new Instructor(16l, "Jeeves"));
        return new Instructors(ukInstructorList);
    }

   @Bean
   @Primary
    public Instructors instructors() {
        List<Instructor> zipCodeWilmingtonInstructorsList = new ArrayList<>();
        zipCodeWilmingtonInstructorsList.add(new Instructor(17l, "Nhu"));
        zipCodeWilmingtonInstructorsList.add(new Instructor(18l, "Leon"));
        zipCodeWilmingtonInstructorsList.add(new Instructor(19l, "Wil"));
        return new Instructors(zipCodeWilmingtonInstructorsList);
    }


}

