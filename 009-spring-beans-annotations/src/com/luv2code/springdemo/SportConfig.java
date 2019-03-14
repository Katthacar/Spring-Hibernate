package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.luv2code.springdemo.impl.SadFortuneService;
import com.luv2code.springdemo.impl.SwimCoach;
import com.luv2code.springdemo.interfaces.ICoach;
import com.luv2code.springdemo.interfaces.IFortuneService;

@Configuration
@PropertySource("classpath:sport.properties")
// @ComponentScan("com.luv2code.springdemo")
public class SportConfig {

  // Define bean for our sad fortune service
  @Bean
  public IFortuneService sadFortuneService() {
    return new SadFortuneService();
  }

  // Define bean for our swim coach and inject dependency
  @Bean
  public ICoach swimCoach() {
    return new SwimCoach(this.sadFortuneService());
  }

}
