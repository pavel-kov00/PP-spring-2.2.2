package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


public class CarServiceImpl {

//    @Autowired
//    private CarDao carDao;

    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Lexus","470GX",210));
        cars.add(new Car("T-34","4vd",1970));
        cars.add(new Car("T-90","xxx",2010));
        cars.add(new Car("Lexus","520GX",205));
        cars.add(new Car("Akura", "msa", 140));
    }

    public static List<Car>  showCars(int count) {
        if (count > 0 && count < 5) {
            return cars.stream().limit(count).toList();
        } else {
            return cars;
        }
    }

//    @Override
//    public void add(Car car) {
//        carDao.add(car);
//    }
//
//    @Override
//    public List<Car> getCar(int count) {
//        return carDao.getCar(count);
//    }
//
//    @Override
//    public List<Car> getAllCars() {
//        return carDao.getAllCars();
//    }

}
