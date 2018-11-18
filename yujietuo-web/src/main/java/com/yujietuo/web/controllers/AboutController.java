package com.yujietuo.web.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.Map;

@Controller
public class AboutController {
    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @GetMapping("/about")
    public String welcome(Map<String, Object> model) {
        System.out.println("about ===>");
        model.put("time", new Date());
        model.put("message", this.message);
        return "about";
    }
}
