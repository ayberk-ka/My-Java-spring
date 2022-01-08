package com.mskapp.msk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {

    @GetMapping("/sgin up")
    public String getSgin_upPage(){
        return "sgin_upPage";
    }
}
