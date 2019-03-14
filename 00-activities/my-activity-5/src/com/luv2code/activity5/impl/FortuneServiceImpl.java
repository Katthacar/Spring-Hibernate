package com.luv2code.activity5.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import com.luv2code.activity5.services.IFortuneService;

public class FortuneServiceImpl implements IFortuneService {

  private List<String> fortunes = new ArrayList<>();
  private String fileName = "C:\\Users\\capidevrga\\Documents\\workspaces\\sts-projects\\Udemy\\Spring-Hibernate\\00-activities\\fortune-data.txt";

  public FortuneServiceImpl() {
  }

  @PostConstruct
  private void readFile() {
    FileReader file;
    try {
      file = new FileReader(fileName);
      BufferedReader bf = new BufferedReader(file);
      String line;
      while ((line = bf.readLine()) != null)
        fortunes.add(line);
      bf.close();
    } catch (IOException e) {
      System.out.println("Error");
      // e.printStackTrace();
    }

  }

  @Override
  public String getDailyFortune() {
    return this.fortunes.get(new Random().nextInt(this.fortunes.size()));
  }

}
