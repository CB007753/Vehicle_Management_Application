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
    public String hr(){
        return "/hr/index";
    }

    @GetMapping("/vehicle")
    public String vehicle(){
        return "/vehicle/index";
    }

    @GetMapping("/helpdesk")
    public String helpdesk(){
        return "/helpdesk/index";
    }

    @GetMapping("/accounts")
    public String accounts(){
        return "/accounts/index";
    }

    @GetMapping("/payroll")
    public String payroll(){
        return "/payroll/index";
    }

    @GetMapping("/settings")
    public String settings(){
        return "/settings/index";
    }
}
