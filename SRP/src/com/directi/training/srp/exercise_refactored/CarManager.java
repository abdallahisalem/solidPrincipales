package com.directi.training.srp.exercise_refactored;

import java.util.List;

import com.directi.training.srp.exercise.Car;

public class CarManager {
    private CarDatabase carDatabase;
    private CarFormatter carFormatter;

    public CarManager(CarDatabase carDatabase, CarFormatter carFormatter) {
        this.carDatabase = carDatabase;
        this.carFormatter = carFormatter;
    }

    public Car getCarById(String carId) {
        return carDatabase.getCarById(carId);
    }

    public String getCarsNames() {
        List<Car> cars = carDatabase.getAllCars();
        return carFormatter.formatCarNames(cars);
    }

    public Car getBestCar() {
        return carDatabase.getBestCar();
    }
}
