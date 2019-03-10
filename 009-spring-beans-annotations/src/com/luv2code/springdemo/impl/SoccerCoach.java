package com.luv2code.springdemo.impl;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.interfaces.ICoach;

@Component
public class SoccerCoach implements ICoach {

  @Override
  public String getDailyWorkout() {
    return "Practice Penalty kicks";
  }

  @Override
  public String getDailyFortune() {
    return "";
  }

}
