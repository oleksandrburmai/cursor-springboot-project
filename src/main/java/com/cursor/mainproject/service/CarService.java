package com.cursor.mainproject.service;

import com.cursor.mainproject.domain.model.Car;
import com.cursor.mainproject.domain.model.User;
import com.cursor.mainproject.domain.model.dto.CarDTO;
import com.cursor.mainproject.domain.model.dto.Response;

import java.util.List;

public interface CarService {

    void saveNewCar(CarDTO carDTO, User userId);

    Response updateCar(User userId, Integer carId, Car car);

    Response deleteCar(User userId, Integer carId);

    List<Car> allUserCar(User userId);

}
