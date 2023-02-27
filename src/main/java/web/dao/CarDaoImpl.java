package web.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.Car;

import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    //    @Autowired
//    private SessionFactory sessionFactory;
//
//    @Override
//      public void add(Car car) {
//        sessionFactory.getCurrentSession().save(car);
//    }
//
//    @Override
//    public List<Car> getCar(int count) {
//        TypedQuery<Car>  query = sessionFactory.getCurrentSession().createQuery("from Car");
//        query.setMaxResults(count);
//        return query.getResultList();
//    }
//
//    @Override
//    public List<Car> getAllCars() {
//        TypedQuery<Car>  query = sessionFactory.getCurrentSession().createQuery("from Car");
//        return query.getResultList();
//    }
    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Lexus", "470GX", 210));
        cars.add(new Car("T-34", "4vd", 1970));
        cars.add(new Car("T-90", "xxx", 2010));
        cars.add(new Car("Lexus", "520GX", 205));
        cars.add(new Car("Akura", "msa", 140));
    }

    public  List<Car> showCars(int count) {
        if (count > 0 && count < 5) {
            return cars.stream().limit(count).toList();
        } else {
            return cars;
        }
    }
}