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
public class InstructorsConfigTest {

    @Autowired
    @Qualifier("tcUSAInstructors")
    Instructors tcUSAInstructors;

    @Autowired
    @Qualifier("tcUKInstructors")
    Instructors tcUKInstructors;

    @Autowired
    @Qualifier("instructors")
    Instructors instructors;

    @Test
    public void sizeUSA() {
        // Given
        Integer expected = 3;
        // When
        Integer actual = tcUSAInstructors.size();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeUK() {
        // Given
        Integer expected = 3;
        // When
        Integer actual = tcUKInstructors.size();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeInstructors() {
        // Given
        Integer expected = 3;
        // When
        Integer actual = instructors.size();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tcUSAInstructors() {
        List<String> expected = new ArrayList<>();
        expected.add("Bill");
        expected.add("Nye");
        expected.add("Science-Guy");


        for (Instructor instructor : tcUSAInstructors.findAll()) {
            String current = instructor.getName();
            Assert.assertTrue(expected.contains(current));
        }
    }

    @Test
    public void tcUKInstructors() {
        List<String> expected = new ArrayList<>();
        expected.add("Posh");
        expected.add("Chesterfield");
        expected.add("Jeeves");

        for (Instructor instructor : tcUKInstructors.findAll()) {
            String current = instructor.getName();
            Assert.assertTrue(expected.contains(current));
        }
    }

    @Test
    public void instructors() {
        List<String> expected = new ArrayList<>();
        expected.add("Nhu");
        expected.add("Leon");
        expected.add("Wil");

        for (Instructor instructor : instructors.findAll()) {
            String current = instructor.getName();
            Assert.assertTrue(expected.contains(current));

        }
    }
}

