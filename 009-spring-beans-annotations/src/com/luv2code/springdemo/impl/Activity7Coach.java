package com.luv2code.springdemo.impl;

import com.luv2code.springdemo.interfaces.ICoach;
import com.luv2code.springdemo.interfaces.IFortuneService;

public class Activity7Coach implements ICoach {

  private IFortuneService fortuneService;

  public Activity7Coach(IFortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "I'm Making my homework";
  }

  @Override
  public String getDailyFortune() {
    return this.fortuneService.getDailyFortune();
  }

}
