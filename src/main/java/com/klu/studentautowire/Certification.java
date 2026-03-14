package com.klu.studentautowire;

import org.springframework.stereotype.Component;

@Component
public class Certification {

    private int id = 101;
    private String name = "Spring";
    private String dateOfCompletion = "2026";

    @Override
    public String toString() {
        return "Certification ID: " + id + 
               ", Name: " + name + 
               ", Date of Completion: " + dateOfCompletion;
    }
}