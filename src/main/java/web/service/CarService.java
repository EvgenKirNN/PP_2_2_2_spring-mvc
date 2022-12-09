package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("VAZ", 2101, "white"));
        cars.add(new Car("GAZ", 3310, "brown"));
        cars.add(new Car("UAZ", 3151, "gray"));
        cars.add(new Car("VAZ", 2110, "black"));
        cars.add(new Car("ZAZ", 1102, "yellow"));
    }

    public List<Car> getCars() {
        return cars;
    }
}
