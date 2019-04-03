package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentConfigTest {

    @Autowired
    @Qualifier("students")
    Students students;

    @Autowired
    @Qualifier("previousStudents")
    Students previousStudents;


    @Test
    public void currentStudentsSize() {
        // Given
        Integer expected = 3;
        // When
        Integer actual = students.size();
        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void previousStudentsSize() {
        // Given
        Integer expected = 4;
        // When
        Integer actual = previousStudents.size();
        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void currentStudents() {
        // Given
        List<String> expected = new ArrayList<>();
        expected.add("Sean");
        expected.add("Alexander");
        expected.add("MacLaughlin");


//        students.findAll().forEach(student -> Assert.assertTrue(expected.contains(student.getName())));
        // When

            for(Student student : students.findAll()) {
                String current = student.getName();
                Assert.assertTrue(expected.contains(current));

            }

    }

    @Test
    public void previousStudents() {
        // Given
        List<String> expected = new ArrayList<>();
        expected.add("John");
        expected.add("Jacob");
        expected.add("Jingle-Heimer");
        expected.add("Smith");

        for(Student previousStudent : previousStudents.findAll()) {
            String current = previousStudent.getName();
            Assert.assertTrue(expected.contains(current));
        }
    }



}