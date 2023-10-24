package com.example.SwitchApplicatie.Controller;


import com.example.SwitchApplicatie.Entity.CareerPaths;
import com.example.SwitchApplicatie.Entity.CareerPaths;
import com.example.SwitchApplicatie.Service.CareerPathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*@RestController
@RequestMapping("/career-paths")
public class CareerPathController {

    @Autowired
    private CareerPathService careerPathService;

    @Autowired
    public CareerPathController(CareerPathService careerPathService) {
        this.careerPathService = careerPathService;
    }

    @GetMapping("/{pathID}")
    public ResponseEntity<CareerPaths> getCareerPath(@PathVariable int pathID) {
        CareerPaths careerPath = careerPathService.getCareerPathById(pathID);
        if (careerPath != null) {
            return ResponseEntity.ok(careerPath);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
