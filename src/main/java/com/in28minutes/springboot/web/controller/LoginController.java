package com.in28minutes.springboot.web.controller;

import com.in28minutes.springboot.web.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("login_name")
public class LoginController {

    @Autowired // Inject Automatically
    private LoginService loginService;

    @RequestMapping("/greet")
    public @ResponseBody
    String greetMessage() {
        return "Hello World from Spring Boot!";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model) {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password) {
        boolean isValidUser = loginService.validateUser(name, password);
        if (!isValidUser) {
            model.put("error_message", "Invalid Credentials, Try again!");
            return "login";
        }
        model.put("login_name", name);
        model.put("login_password", password);
        return "welcome";
    }
}
