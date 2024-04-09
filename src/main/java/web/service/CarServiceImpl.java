package web.service;

import model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car(1L, "model1", "RED"));
        cars.add(new Car(2L, "model2", "BLUE"));
        cars.add(new Car(3L, "model3", "BLACK"));
        cars.add(new Car(4L, "model4", "PINK"));
        cars.add(new Car(5L, "model5", "GREEN"));
    }

    @Override
    public List<Car> carsCount(int count) {
        if (count >= 5) {
            return cars;
        } else if (count > 0) {
            return cars.stream().limit(count).collect(Collectors.toList());
        } else {
            return cars;
        }
    }
}
