package com.cursor.mainproject.service.impl;

import com.cursor.mainproject.domain.model.Car;
import com.cursor.mainproject.domain.model.User;
import com.cursor.mainproject.domain.model.dto.CarDTO;
import com.cursor.mainproject.domain.model.dto.Response;
import com.cursor.mainproject.domain.repository.CarRepository;
import com.cursor.mainproject.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {


    private final CarRepository carRepository;

    @Override
    public void saveNewCar(CarDTO carDTO, User userId) {
        carRepository.save(Car.builder()
                .mark(carDTO.getMark())
                .model(carDTO.getModel())
                .type(carDTO.getType())
                .price(carDTO.getPrice())
                .year(carDTO.getYear())
                .countryOfRegistration(carDTO.getCountryOfRegistration())
                .description(carDTO.getDescription())
                .userId(userId)
                .build());
    }

    @Override
    public Response updateCar(User userId, Integer carId, Car car) {
        if (carRepository.findById(carId).isPresent() & carRepository.findById(carId).get().getUserId() == userId) {
            carRepository.save(car);
            return Response.builder()
                    .message("Car info updated")
                    .build();
        }
        return Response.builder()
                .message("Can not update car info")
                .build();
    }

    @Override
    public Response deleteCar(User userId, Integer carId) {
        if (carRepository.findById(carId).isPresent() & carRepository.findById(carId).get().getUserId() == userId) {
            carRepository.deleteById(carId);
            return Response.builder()
                    .message("Car deleted")
                    .build();
        }
        return Response.builder()
                .message("Can not delete car")
                .build();
    }

    @Override
    public List<Car> allUserCar(User userId) {
        return carRepository.findAllByUserId(userId);
    }
}
