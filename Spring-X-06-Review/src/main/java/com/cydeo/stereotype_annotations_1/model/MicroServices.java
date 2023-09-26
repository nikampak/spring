package com.cydeo.stereotype_annotations_1.model;

import org.springframework.stereotype.Component;

@Component
public class MicroServices {
    public void getTotalHours(){
        System.out.println("Total hours: " + 25);
    }
}
