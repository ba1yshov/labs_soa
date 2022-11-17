package com.example.lab3.controllers;

import com.example.lab3.SignIn;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    private SignIn signIn = new SignIn();

    @GetMapping("/")
    public String home( Model model) {
        model.addAttribute("signIn", signIn);
        return "index";
    }

    @PostMapping("/")
    public String home(@ModelAttribute("signIn") SignIn signIn, Model model)
    {
        model.addAttribute("signIn", signIn);
        return "index";
    }

}