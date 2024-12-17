package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/thymeleaf")
public class ThymeleafExController {
    @GetMapping(value = "/ex01")
    public String thymeleafEx01(Model model) {
        model.addAttribute("data", "타임리프 예제ㅇadfdfdfㄹ");
        return "thymeleafEX/thymeleafEx01";
    }
}
