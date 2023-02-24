package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

//    public static List<Car> showCars(int count);
    public void add(Car car);
    public List<Car> getCar(int count);
    public List<Car> getAllCars();
}
