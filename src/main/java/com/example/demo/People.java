package com.example.demo;

import java.util.Arrays;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {
    private List<PersonType> personList;

    public People(List<PersonType> personList) {
        this.personList = personList;
    }

    public People(PersonType... people) {
        this.personList = Arrays.asList(people);
    }

    public void add(PersonType person) {
        personList.add(person);
    }

    public void remove(PersonType person) {
        personList.remove(person);
    }

    public Integer size() {
        return personList.size();
    }

    public void clear() {
        personList.clear();
    }

    public void addAll(Iterable<PersonType> personTypeIterable) {
       for(PersonType person : personList) {
           personList.add(person);
        }
    }

    public PersonType findById(long id) {
        for(PersonType person : personList) {
            if(person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public List<PersonType> findAll() {
        return personList;
    }

}
