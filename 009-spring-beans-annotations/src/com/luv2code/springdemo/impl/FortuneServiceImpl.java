package com.luv2code.springdemo.impl;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.interfaces.IFortuneService;

@Component
public class FortuneServiceImpl implements IFortuneService {

  @Override
  public String getDailyFortune() {
    return "Go Ahead, today is your lucky day";
  }

}
