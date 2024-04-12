package ru.bikbaev;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.*;

@EqualsAndHashCode
@ToString

public class Person implements Serializable{
    private String firstName;
    private String lastName;
    private String age;

    public Person(String firstName, String lastName, String age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }



}
