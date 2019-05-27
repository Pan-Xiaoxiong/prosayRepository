package com.prosay.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("title", "你好 Thymeleaf");
        return "index";
    }
}
