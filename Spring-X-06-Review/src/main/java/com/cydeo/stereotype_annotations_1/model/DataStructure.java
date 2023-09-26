package com.cydeo.stereotype_annotations_1.model;

import org.springframework.stereotype.Component;

@Component
public class DataStructure {
    public void getTotalHours(){
        System.out.println("Total hours: " + 40);
    }
}
