package com.PJ.kfs.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class userController {

    @GetMapping("/welcome")
    public String abcde ()
    {
        return "welcome";
    }
    @PostMapping("/regist")

}