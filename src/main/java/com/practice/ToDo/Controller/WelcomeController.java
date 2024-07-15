package com.practice.ToDo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @RequestMapping("home")
    public String welcome() {
        return "welcome";
    }
}
