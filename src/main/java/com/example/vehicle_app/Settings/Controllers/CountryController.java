package com.example.vehicle_app.Settings.Controllers;

import com.example.vehicle_app.Settings.Models.Country;
import com.example.vehicle_app.Settings.Services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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


    @GetMapping("/countryAdd")
    public String addCountry(){
        return "/settings/countryAdd";
    }

    @GetMapping("/countryEdit/{id}")
    public String editCountry(@PathVariable Integer id, Model model){

        Country country = countryService.getCountryByID(id);
        model.addAttribute("country", country);

        return "/settings/countryEdit";
    }

    //display selected country details in a read only form
    @GetMapping("/countryDetails/{id}")
    public String getCountryDetails(@PathVariable Integer id, Model model){

        Country country = countryService.getCountryByID(id);
        model.addAttribute("country", country);

        return "/settings/countryDetails";
    }

    @PostMapping("/countries")
    public String save(Country country){
        countryService.saveCountry(country);
        return "redirect:/countries";
    }

    @RequestMapping(value = "/countries/delete/{id}", method = {RequestMethod.GET, RequestMethod.DELETE})
    public String delete(@PathVariable Integer id){
        countryService.DeleteCountryByID(id);
        return "redirect:/countries";
    }

    @RequestMapping(value = "/countries/update/{id}", method = {RequestMethod.GET, RequestMethod.PUT})
    public String update(Country country){
        countryService.saveCountry(country);
        return "redirect:/countries";
    }


}
