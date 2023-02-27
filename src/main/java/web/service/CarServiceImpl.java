package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private CarDao carDao;



    public  List<Car>  showCars(int count) {
      return carDao.showCars(count);
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
