package com.in28minutes.springboot.web.service;

import org.springframework.stereotype.Component;

@Component // Register this as a Spring Bean
public class LoginService {

    public boolean validateUser(String userId, String password) {
        return userId.equalsIgnoreCase("tester") &&
                password.equalsIgnoreCase("test");
    }

}
