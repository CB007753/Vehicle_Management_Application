package com.example.vehicle_app.Settings.Controllers;

import com.example.vehicle_app.Settings.Models.State;
import com.example.vehicle_app.Settings.Services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StateCountroller {

    @Autowired
    private StateService stateService;


    @GetMapping("/states")
    public String getAll(Model model){

        List<State> states = stateService.getAll();

        model.addAttribute("states", states);

        return "settings/stateList";
    }

}
