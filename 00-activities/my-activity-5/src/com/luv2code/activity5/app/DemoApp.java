package com.luv2code.activity5.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.activity5.config.ConfigActivity5;
import com.luv2code.activity5.services.ICoach;

public class DemoApp {

  public static void main(String[] args) {

    // Load context from Spring config file
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
        ConfigActivity5.class);

    // Retrieve the beans from Spring container
    ICoach coach = context.getBean("activity5CoachImpl", ICoach.class);

    // Invoque methods from beand
    System.out.println(">> activity5CoachImpl -> getDailyWork() method: " + coach.getDailyWork());

    System.out.println(
        ">> activity5CoachImpl -> getDailyFortune() method: " + coach.getDailyFortune());

    // Close the context
    context.close();

  }

}
