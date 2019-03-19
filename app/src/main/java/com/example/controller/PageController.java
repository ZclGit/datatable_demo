package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("pageController")
public class PageController {

    @RequestMapping("menu")
    public String gotoMenu() {
        return "redirect:/static/html/index.html";
    }
}
