package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.interfaces.ICoach;

public class AnnotationDemoApp {

  public static void main(String[] args) {

    // Read the spring config file
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "applicationContext.xml");

    // Retrieve the beans from the spring container
    ICoach tennisCoach = context.getBean("tennisCoach", ICoach.class);

    // Call a method on the bean
    System.out.println(tennisCoach.getDailyWorkout());

    System.out.println(tennisCoach.getDailyFortune());

    // Homework
    // ICoach soccerCoach = context.getBean("soccerCoach", ICoach.class);
    // System.out.println(soccerCoach.getDailyWorkout());

    // Close the context
    context.close();

  }

}
