package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarController {
    @Autowired
    CarService carService;
    @GetMapping(value = "/car")
    public String printCar(ModelMap model, @RequestParam(value = "count", defaultValue = "3") int count){
        System.out.println("count = " + count );
        System.out.println(carService.showCars(count));
        model.addAttribute("cars", carService.showCars(count));
        return "car";
    }
}
