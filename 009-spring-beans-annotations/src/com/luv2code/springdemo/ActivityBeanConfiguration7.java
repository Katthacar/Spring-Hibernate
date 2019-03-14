package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.luv2code.springdemo.impl.Activity7Coach;
import com.luv2code.springdemo.impl.ActivityService7Impl;
import com.luv2code.springdemo.interfaces.ICoach;
import com.luv2code.springdemo.interfaces.IFortuneService;

@Configuration
public class ActivityBeanConfiguration7 {

  @Bean
  public IFortuneService activityService7Impl() {
    return new ActivityService7Impl();
  }

  @Bean
  public ICoach activity7Coach() {
    return new Activity7Coach(activityService7Impl());
  }

}
