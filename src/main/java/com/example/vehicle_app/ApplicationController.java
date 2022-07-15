package com.example.vehicle_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping("/index")
    public String goHome(){
        return "index";
    }

    @GetMapping("/hr")
    public String hrHome(){
        return "/hr/index";
    }
}
