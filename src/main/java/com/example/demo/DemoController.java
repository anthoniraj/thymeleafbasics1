package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @GetMapping("/")
    @ResponseBody
    public String home() {        
        return "Hi There! Welcome";
    }     

    @GetMapping("/demo")
    public String demo(Model model) {
        model.addAttribute("temp", "Always display this message!");
        model.addAttribute("flag",true);

        var employee = Arrays.asList("Kumar", "Kamal", "Raja");
        model.addAttribute("employee", employee);

        return "demo";
    }
}
