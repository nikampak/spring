package com.cydeo.bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnotherConfigApp {
//    @Bean @Primary
    @Bean
    public String str1(){
        return "Welcome to Cydeo 1";
    }
    @Bean
    public String str2(){
        return "Welcome to Cydeo 2";
    }
}
