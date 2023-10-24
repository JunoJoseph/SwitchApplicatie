/*package com.example.SwitchApplicatie.Service;

import com.example.SwitchApplicatie.Entity.CareerPaths;
import com.example.SwitchApplicatie.Entity.CareerPaths;
import com.example.SwitchApplicatie.Repository.CareerPathRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CareerPathService {

    private CareerPathRepository careerPathRepository;

    @Autowired
    public CareerPathService(CareerPathRepository careerPathRepository) {
    }

    public CareerPaths getCareerPathById(int pathID) {
        return careerPathRepository.findById(pathID).orElse(null);
    }



}

