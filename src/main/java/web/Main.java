package web;

import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        CarService carService = new CarServiceImp();


        List<Car> selectedCars = carService.getCars(3);


        for (Car car : selectedCars) {
            System.out.println(car);
    }
}
}

