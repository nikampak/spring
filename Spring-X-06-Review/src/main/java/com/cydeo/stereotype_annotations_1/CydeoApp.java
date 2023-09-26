package com.cydeo.stereotype_annotations_1;

import com.cydeo.stereotype_annotations_1.config.AppConfig;
import com.cydeo.stereotype_annotations_1.model.DataStructure;
import com.cydeo.stereotype_annotations_1.model.MicroServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);

        DataStructure dataStructure = container.getBean(DataStructure.class);
        dataStructure.getTotalHours();

        MicroServices ms = container.getBean(MicroServices.class);
        ms.getTotalHours();
    }
}
