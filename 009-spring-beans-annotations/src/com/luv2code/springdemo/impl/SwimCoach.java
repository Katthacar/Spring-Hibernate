package com.luv2code.springdemo.impl;

import org.springframework.beans.factory.annotation.Value;

import com.luv2code.springdemo.interfaces.ICoach;
import com.luv2code.springdemo.interfaces.IFortuneService;

public class SwimCoach implements ICoach {

  private IFortuneService fortuneService;

  @Value("${foo.name}")
  private String name;

  @Value("${email}")
  private String email;

  @Value("${team}")
  private String team;

  public SwimCoach(IFortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Swim 1000 meters as a warm up.";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getDailyFortune();
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public String getTeam() {
    return team;
  }

}
