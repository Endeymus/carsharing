package com.endeymus.carsharing.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping("/")
    public String main(Model model, Principal principal) {
        model.addAttribute("username", principal.getName());
        return "main/main";
    }

    @GetMapping("/login")
    public String login() {
        return "main/login";
    }

    @ModelAttribute("title")
    public String title() {
        return "Главная страница";
    }
}
