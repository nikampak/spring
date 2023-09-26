package com.cydeo.bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public FulltimeEmployee fulltimeEmployee(){
        return new FulltimeEmployee();
    }
    @Bean
    public ParttimeEmployee parttimeEmployee(){
        return new ParttimeEmployee();
    }
}
