package com.cydeo.stereotype_annotations_2.model;

import org.springframework.stereotype.Component;

@Component
public class MicroServices {
    public void getTotalHours(){
        System.out.println("Total hours: " + 25);
    }
}
