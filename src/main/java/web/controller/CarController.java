package web.controller;

import web.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("VAZ", 2101, "white"));
        cars.add(new Car("GAZ", 3310, "brown"));
        cars.add(new Car("UAZ", 3151, "gray"));
        cars.add(new Car("VAZ", 2110, "black"));
        cars.add(new Car("ZAZ", 1102, "yellow"));

        model.addAttribute("cars", (count == null || count >= 5) ? cars : cars.stream().limit(count).toList());

        return "cars";
    }
}
