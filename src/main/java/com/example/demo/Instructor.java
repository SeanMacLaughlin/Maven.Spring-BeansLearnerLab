package com.example.demo;

import org.apache.tomcat.util.net.SendfileDataBase;

public class Instructor extends Person implements Teacher {
    private double numberOfHours;


    public Instructor(Long id, String name) {
        super(id, name);
    }


    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        Integer learnerCount = 0;
        for (Learner learner : learners) {
            learnerCount++;
        }

        for (Learner learner : learners) {
            teach(learner, numberOfHours / learnerCount);
        }
    }
}
