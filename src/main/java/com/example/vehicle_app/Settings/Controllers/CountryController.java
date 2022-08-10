package com.example.vehicle_app.Settings.Controllers;

import com.example.vehicle_app.Settings.Models.Country;
import com.example.vehicle_app.Settings.Services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;


    @GetMapping("/countries")
    public String getAll(Model model){

       List<Country> countries =  countryService.getAll();

       model.addAttribute("countries", countries);
       return "settings/countryList";

    }

}
