package com.example.vehicle_app.Settings.Services;

import com.example.vehicle_app.Settings.Models.State;
import com.example.vehicle_app.Settings.Repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    //fetch all the records in the country table(from database)
    public List<State> getAll(){
        return stateRepository.findAll();
    }

    //delete state by id
    public void deleteStateByID(Integer id){
        stateRepository.deleteById(id);
    }
}
