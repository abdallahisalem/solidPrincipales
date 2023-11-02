package com.directi.training.srp.exercise_refactored;


import java.util.Arrays;
import java.util.List;

import com.directi.training.srp.exercise.Car;

public class CarDatabase {
    private List<Car> carsDb;

    public CarDatabase() {
        carsDb = Arrays.asList(
            new Car("1", "Golf III", "Volkswagen"),
            new Car("2", "Multipla", "Fiat"),
            new Car("3", "Megane", "Renault")
        );
    }

    public Car getCarById(String carId) {
        for (Car car : carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    public List<Car> getAllCars() {
        return carsDb;
    }

    public Car getBestCar() {
        Car bestCar = null;
        for (Car car : carsDb) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
