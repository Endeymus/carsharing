package com.endeymus.carsharing.utils;

import com.endeymus.carsharing.models.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarHelper {
    private List<Car> cars;

    private ThingsboardParser parser;

    @Autowired
    public void setParser(ThingsboardParser parser) {
        this.parser = parser;
    }

    @Autowired
    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public void update(Car car) {
        List<Object> list = parser.getData(car.getUUID());

        car.setLatitude((Double) list.get(0));
        car.setLongitude((Double) list.get(1));
        car.setOnRoad((Boolean) list.get(2));
    }

    public void updateAll() {
        cars.forEach(this::update);
    }

    public void marks() {
        cars.forEach(x->{
            System.out.println(x.getModel());
        });
    }

    public Car getCar(String UUID) {
        return cars.stream().filter(car -> car.getUUID().equals(UUID)).findFirst().get();
    }

    public List<Car> getAllCars() {
        return cars;
    }
}
