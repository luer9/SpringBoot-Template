package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 在templates目录下的所有页面，只能通过controller来跳转。
// 需要模版引擎的支持。thymeleaf
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("msg", "tell the world i love u");
        return "index";
    }
}
