package com.luv2code.springdemo.impl;

import com.luv2code.springdemo.interfaces.IFortuneService;

public class SadFortuneService implements IFortuneService {

  @Override
  public String getDailyFortune() {
    return "Today is a sad day";
  }

}
