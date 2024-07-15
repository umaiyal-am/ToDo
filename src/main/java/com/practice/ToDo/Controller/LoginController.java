package com.practice.ToDo.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
    @GetMapping("login")
    public String userLogin() {
        return "login";
    }

    @PostMapping("login")
    public String validateUser(@RequestParam String uname, @RequestParam String pass, ModelMap model) {
        if(ValitationUtility.validateCredentials(uname, pass)) {
            model.put("uname", uname);
            model.put("pass", pass);
            return "welcome";
        }
        else {
            model.put("invalidError","Invalid Credentials. Please try again");
            return "login";
        }

    }


}
