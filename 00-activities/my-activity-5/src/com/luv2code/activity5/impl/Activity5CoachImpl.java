package com.luv2code.activity5.impl;

import com.luv2code.activity5.services.ICoach;
import com.luv2code.activity5.services.IFortuneService;

public class Activity5CoachImpl implements ICoach {

  private IFortuneService fortuneService;

  public Activity5CoachImpl(IFortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWork() {
    return "Run 5 km on 30 min";
  }

  @Override
  public String getDailyFortune() {
    return this.fortuneService.getDailyFortune();
  }

}
