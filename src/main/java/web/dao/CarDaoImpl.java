package web.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.Car;

import javax.persistence.TypedQuery;
import java.util.List;

//@Repository
//public class CarDaoImpl implements CarDao {

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
//}