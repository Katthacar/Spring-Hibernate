package com.luv2code.activity5.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.luv2code.activity5.impl.Activity5CoachImpl;
import com.luv2code.activity5.impl.FortuneServiceImpl;
import com.luv2code.activity5.services.ICoach;
import com.luv2code.activity5.services.IFortuneService;

@Configuration
public class ConfigActivity5 {

  @Bean
  public IFortuneService fortuneService() {
    return new FortuneServiceImpl();
  }

  @Bean
  public ICoach activity5CoachImpl() {
    return new Activity5CoachImpl(this.fortuneService());
  }

}
