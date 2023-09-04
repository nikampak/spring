package com.cydeo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor

//@Component
public class Java
{
//  FIELD INJECTION
//  @Autowired
//  OfficeHours officeHours;
//public void getTeachingHours()
//{System.out.println("Weekly teaching hours: " + (20 + officeHours.getHours()) ); }

//  CONSTRUCTION INJECTION - @Autowired for the constructor
//  OfficeHours officeHours;
//  @Autowired
//  public  Java(OfficeHours officeHours){
//    this.officeHours = officeHours;}
//    public void getTeachingHours()
//  {System.out.println("Weekly teaching hours: " + (20 + officeHours.getHours()) );}

  //Dependency Injection - add @AllArgsConstructor; no need to create an @Autowired constructor
  OfficeHours officeHours;
  public void getTeachingHours()
  {
    System.out.println("Weekly teaching hours: " + (20 + officeHours.getHours()) );
  }
}
