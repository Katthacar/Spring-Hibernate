package com.luv2code.springdemo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.luv2code.springdemo.interfaces.ICoach;
import com.luv2code.springdemo.interfaces.IFortuneService;

//@Component("thatSillyCoach") // Bean with custom id 
@Component // Bean with default id
public class TennisCoach implements ICoach {

  // Inject bean by field injection
  @Autowired
  private IFortuneService fortuneService;

  public TennisCoach() {
    System.out.println(">> TennisCoach: Inside default constructor");
  }

  /*
   * Inject bean by constructor Si solo existiera un constructor, la anotación
   * Autowired es opcional, pero como tenemos dos constructores es obligatoria
   * para decirle a Spring cual constructor debe inyectar
   */
  // @Autowired
  // public TennisCoach(IFortuneService fortuneService) {
  // this.fortuneService = fortuneService;
  // }

  @Override
  public String getDailyWorkout() {
    return "Practice your backhand volley";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getDailyFortune();
  }

  // Inject bean by set method
  // @Autowired
  // public void setFortuneService(IFortuneService fortuneService) {
  // System.out.println(">> setFortuneService");
  // this.fortuneService = fortuneService;
  // }

  // Inject bean by any method
  // @Autowired
  // public void doSomeCrazyStuff(IFortuneService fortuneService) {
  // System.out.println(">> Autowired on in doSomeCrazyStuff()");
  // this.fortuneService = fortuneService;
  // }

}
