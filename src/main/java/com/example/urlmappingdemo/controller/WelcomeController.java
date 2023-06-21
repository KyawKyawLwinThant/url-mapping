package com.example.urlmappingdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    @GetMapping("/greet")
    public String greeting(Model model){
        model.addAttribute("tagline","Hello");
        return "welcome";
    }
    @GetMapping("/sayspring")
    public String saySpring(Model model){
        model.addAttribute("tagline"
                ,"Say Spring MVC");
        return "welcome";
    }
    @GetMapping({"/","/home"})
    public String welcome(Model model){
        model.addAttribute("tagline",
                "Welcome Spring MVC");
        return "welcome";
    }
}
