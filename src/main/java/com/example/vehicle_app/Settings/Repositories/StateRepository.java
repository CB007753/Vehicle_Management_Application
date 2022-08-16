package com.example.vehicle_app.Settings.Repositories;

import com.example.vehicle_app.Settings.Models.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {
}
