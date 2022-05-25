package web.dao;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

public interface CarDao {
    List<Car> getCars();
}
