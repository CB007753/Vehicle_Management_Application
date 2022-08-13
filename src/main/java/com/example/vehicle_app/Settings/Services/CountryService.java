package com.example.vehicle_app.Settings.Services;

import com.example.vehicle_app.Settings.Models.Country;
import com.example.vehicle_app.Settings.Repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    //fetch all the records in the country table(from database)
    public List<Country> getAll(){
        return countryRepository.findAll();
    }

    //save the new country added by the user
    public void saveCountry(Country country){
         countryRepository.save(country);
    }

    //delete a country by id
    public void DeleteCountryByID(Integer id){
        countryRepository.deleteById(id);
    }
}
