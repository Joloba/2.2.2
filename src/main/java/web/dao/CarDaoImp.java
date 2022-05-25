package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {

    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car(1L, "Mersedes S-class", "yellow", 2007));
        carList.add(new Car(2L, "Nissan Almera", "red", 2005));
        carList.add(new Car(3L, "Honda Accord 7", "blue", 2007));
        carList.add(new Car(4L, "BMW 5 series", "yellow", 2009));
        carList.add(new Car(5L, "Audi Q5", "purple", 2012));
    }

    @Override
    public List<Car> getCars() {
        return carList;
    }
}
