package com.klu.studentautowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private int id;
    private String name;
    private String gender;

    @Autowired
    private Certification certification;

    public Student() {
        id = 1;
        name = "Geethika";
        gender = "Female";
    }

    public void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println(certification);  // this will call Certification.toString()
    }
    }