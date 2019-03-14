package com.luv2code.springdemo.impl;

import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.interfaces.IFortuneService;

@Component
public class RandomFortuneServiceImpl implements IFortuneService {

  // Create an array of strings
  private String[] data = {
      "Your first time... come back next time",
      "Oh yeah!, lucky day",
      "Diligenge is the mother of good luck",
      "50. 50, ok, you are fine"
  };

  @Override
  public String getDailyFortune() {
    Random rnd = new Random();
    return data[rnd.nextInt(data.length)];
  }

  @PostConstruct
  public void doMyStartupStuff() {
    System.out.println(">> RandomFortuneService - in doMyStartupStuff: " + this.getDailyFortune());
  }

  @PreDestroy
  public void doMyCleanupStuff() {
    System.out.println(">> RandomFortuneService - in doMyCleanupStuff: " + this.getDailyFortune());
  }

}
