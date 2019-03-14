package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.interfaces.ICoach;
import com.luv2code.springdemo.interfaces.IFortuneService;

public class AnnotationBeanScopeDemoApp {

  public static void main(String[] args) {

    // Read the spring config file
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "applicationContext.xml");

    // Retrieve the bean from the spring container
    ICoach coach = context.getBean("tennisCoach", ICoach.class);

    ICoach alphaCoach = context.getBean("tennisCoach", ICoach.class);

    // Check if they are the same objects
    System.out.println("Pointing the same object: " + (coach == alphaCoach));
    System.out.println("Memory location for coach: " + coach);
    System.out.println("Memory location for alphaCoach: " + alphaCoach);

    // Homework
    IFortuneService fortuneService = context.getBean("randomFortuneServiceImpl",
        IFortuneService.class);
    System.out.println(fortuneService.getDailyFortune());

    // Close the context
    context.close();

  }

}
