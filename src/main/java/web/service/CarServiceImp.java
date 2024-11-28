package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private List<Car> cars;


    public CarServiceImp() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "White", 2022));
        cars.add(new Car("UAZ", "White", 2024));
        cars.add(new Car("Mazda", "Grey", 2018));
        cars.add(new Car("Opel", "White", 2012));
        cars.add(new Car("Kia", "Black", 2020));
    }
    @Override
    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}