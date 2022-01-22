package com.mskapp.msk.controller;

import com.mskapp.msk.modell.UsersModell;
import com.mskapp.msk.services.UsersServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsersController {

    @Autowired
    private final UsersServ usersServ;

    public UsersController(UsersServ usersServ) {
        this.usersServ = usersServ;
    }

    @GetMapping("/signup")
    public String getSgin_upPage(Model model) {
        model.addAttribute("signUpRequest", new UsersModell());
        return "sign_upPage";
    }


    @GetMapping("/login")
    public String getLogin_Page(Model model) {
        model.addAttribute("loginRequest", new UsersModell());
        return "login_Page";
    }


    @PostMapping("/signup")
    public String sgin_up(@ModelAttribute UsersModell usersModell){
        System.out.println("sign_up request: " +usersModell);
        UsersModell signup_User = usersServ.signUp_users
                (
                usersModell.getEmail(),
                usersModell.getPassword(),
                usersModell.getFirst_name(),
                usersModell.getLast_name(),
                usersModell.getGender(),
                usersModell.getDate_of_birth()
                );

        return signup_User == null ? "error_page" : "redirect:/login";

    }

    @PostMapping("/login")
    public String login(@ModelAttribute UsersModell usersModell, Model model){
        System.out.println("login request: " +usersModell);
        UsersModell validate = usersServ.validate(usersModell.getEmail(), usersModell.getPassword());
        if(validate != null){
            model.addAttribute("usersLogin", validate.getFirst_name());
           return "home_page";
        }else {
            return "error_page";
        }


    }

}
