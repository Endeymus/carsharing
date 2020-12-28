package com.endeymus.carsharing.controllers;

import com.endeymus.carsharing.models.Car;
import com.endeymus.carsharing.utils.CarHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/cars")
public class CarsController {

    private CarHelper carHelper;

    @Autowired
    public void setCarHelper(CarHelper carHelper) {
        this.carHelper = carHelper;
    }

    @GetMapping("/")
    public String cars(Model model) {
        carHelper.updateAll();
        model.addAttribute("title", "Все автомобили");
        model.addAttribute("cars", carHelper.getAllCars());
        return "cars/cars";
    }

    @GetMapping("/{UUID}")
    public String singleCar(@PathVariable String UUID, Model model){
        Car car = carHelper.getCar(UUID);
        carHelper.update(car);
        model.addAttribute("title", "Информация о автомобиле");
        model.addAttribute("car", car);
        return "cars/car";
    }

    @GetMapping("/redirect")
    public String redirect() {
        return "redirect:https://demo.thingsboard.io/dashboards/85a95930-4033-11eb-8cad-3d8873d86e51";
    }

}
