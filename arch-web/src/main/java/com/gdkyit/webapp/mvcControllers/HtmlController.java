package com.gdkyit.webapp.mvcControllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

@Controller
public class HtmlController {

    @GetMapping("/about")
    public String welcome(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", "yujietuo website");
        return "about";
    }
}
