package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.springdemo.impl.SwimCoach;

public class SwimJavaConfigDemoApp {

  public static void main(String[] args) {

    // Read the spring config file from SportConfig java class
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
        SportConfig.class);

    // Retrieve the beans from the spring container
    SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);

    // Call a method on the bean
    System.out.println(swimCoach.getDailyWorkout());

    System.out.println(swimCoach.getDailyFortune());

    // Call our swim coach methods ... has the props values injected
    System.out.println("The name: " + swimCoach.getName());

    System.out.println("The email: " + swimCoach.getEmail());

    System.out.println("The team: " + swimCoach.getTeam());

    // Homework
    // ICoach soccerCoach = context.getBean("soccerCoach", ICoach.class);
    // System.out.println(soccerCoach.getDailyWorkout());

    // Close the context
    context.close();

  }

}
