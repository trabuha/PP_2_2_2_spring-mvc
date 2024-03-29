package web.service;


import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("ZEEKR", 01, 1000));
        cars.add(new Car("LADA", 12, 2000));
        cars.add(new Car("BMW", 5, 3000));
        cars.add(new Car("AUDI", 6, 4000));
        cars.add(new Car("PORSCHE", 99, 5000));
        return cars;
    }

    @Override
    public List<Car> getCars(Integer count) {
        List<Car> allCars = getAllCars();
        if (count == null || count >= 5) {
            return allCars;
        } else {
            return allCars.stream().limit(count).collect(Collectors.toList());
        }
    }
}
