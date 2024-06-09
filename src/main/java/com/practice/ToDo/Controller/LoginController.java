package com.practice.ToDo.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @GetMapping("login")
    @ResponseBody
    public String userLogin() {
        return "In Login Page";
    }
}
