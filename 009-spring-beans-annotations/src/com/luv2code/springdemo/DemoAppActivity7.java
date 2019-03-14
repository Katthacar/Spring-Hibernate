package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.springdemo.impl.Activity7Coach;
import com.luv2code.springdemo.interfaces.ICoach;

public class DemoAppActivity7 {

  public static void main(String[] args) {

    // Load the spring config
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
        ActivityBeanConfiguration7.class);

    // Retrieve beans from spring container
    ICoach coach = context.getBean("activity7Coach", Activity7Coach.class);

    // Call methods
    System.out.println(">> Activity7Coach: " + coach.getDailyFortune());

    // Close the context
    context.close();

  }

}
