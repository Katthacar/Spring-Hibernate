package com.luv2code.springdemo.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

  // Need a controller method to show the initial HTML form
  @RequestMapping("/showForm")
  public String showForm() {
    return "helloworld-form";
  }

  // Need a controller method to process the HTML form
  @RequestMapping("/processForm")
  public String processForm() {
    return "helloworld";
  }

  // New controller method to read form data and add data to the model
  @RequestMapping("/processFormVersionTwo")
  public String letsShoutDude(HttpServletRequest request, Model model) {

    // Read the request parameter from the HTML form
    String name = request.getParameter("studentName");

    // Conver the data to all caps
    name = name.toUpperCase();

    // Create the message
    String result = "Yo! " + name;

    // Add message to the model
    model.addAttribute("message", result);

    return "helloworld";
  }

}
