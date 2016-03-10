package com.onassignment.interactive.testapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping(value="/")
    public String index(Model model) {
        model.addAttribute("greeting", "Hello World!");
        return "index";
    }

}
