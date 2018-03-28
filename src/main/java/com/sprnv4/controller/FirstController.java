package com.sprnv4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {

  @RequestMapping(value = "/")
  public String welcomePage() {
    return "index";
  }
}
