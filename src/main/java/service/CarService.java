package service;

import model.Car;

import java.util.List;

public interface CarService {
    static List<Car> carsCount(List<Car> cars, int number) {
        if (number <= 0 || number > cars.size()) return cars;
        return cars.subList(0, number);
    }
}
