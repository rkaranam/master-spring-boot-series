package com.in28minutes.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @RequestMapping("/greet")
    public @ResponseBody String greetMessage() {
        return "Hello World from Spring Boot!";
    }

    @RequestMapping("/login")
    public String loginMessage(@RequestParam String name, ModelMap model) {
        System.out.println("LoginController.loginMessage");
        System.out.println("name = " + name);
        model.put("name", name);
        return "login";
    }
}
