package com.kenshin.controller;

import com.kenshin.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("/signUp")
    @ResponseBody
    public User signUp(User user) {
        System.out.println(user);
        return user;
    }
}
