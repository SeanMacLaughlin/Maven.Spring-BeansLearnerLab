package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    @Bean(name = "currentCohort")
    @DependsOn({"students", "instructors"})
    public Classroom currentCohort(Students students, Instructors instructors) {
        return new Classroom(instructors, students);
    }

    @Bean(name = "previousCohort")
    @DependsOn({"previousStudents", "instructors"})
    public Classroom previousCohort(Students previousStudents, Instructors instructors) {
        return new Classroom(instructors, previousStudents);
    }
}