package web.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String carList(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {
    //public String carList(Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1L, "model1", "RED"));
        cars.add(new Car(2L, "model2", "BLUE"));
        cars.add(new Car(3L, "model3", "BLACK"));
        cars.add(new Car(4L, "model4", "PINK"));
        cars.add(new Car(5L, "model5", "GREEN"));

        cars = CarService.carsCount(cars, allCars);
        model.addAttribute("cars", cars);

        return "Car";
    }


}