
package com.cydeo.bean_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class, AnotherConfigApp.class);

        FulltimeEmployee fulltimeEmployee = container.getBean(FulltimeEmployee.class);
        fulltimeEmployee.createAccount();

        ParttimeEmployee parttimeEmployee = container.getBean(ParttimeEmployee.class);
        parttimeEmployee.createAccount();

        String str = container.getBean("str2", String.class);
        System.out.println("str = " + str);


    }
}
