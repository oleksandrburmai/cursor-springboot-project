package com.cursor.mainproject.controller;

import com.cursor.mainproject.domain.model.Car;
import com.cursor.mainproject.domain.model.User;
import com.cursor.mainproject.domain.model.dto.CarDTO;
import com.cursor.mainproject.domain.model.dto.Response;
import com.cursor.mainproject.service.impl.CarServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Validated
@RestController
@RequiredArgsConstructor
public class CarController {

    private final CarServiceImpl carService;


    @PostMapping("/users/{userId}/newCar")
    public Response newCar(@Valid @RequestBody CarDTO carDTO, @PathVariable(name = "userId") User userId) {
        carService.saveNewCar(carDTO, userId);
        return Response.builder()
                .message("New car added")
                .build();
    }


    @PutMapping("/users/{userId}/car/{carId}/update")
    public Response updateCar(@PathVariable(name = "userId") User userId,
                              @PathVariable(name = "carId") Integer carId,
                              @RequestBody Car car) {
        return carService.updateCar(userId, carId, car);
    }


    @DeleteMapping("/users/{userId}/car/{carId}/delete")
    public Response deleteCar(@PathVariable(name = "userId") User userId,
                              @PathVariable(name = "carId") Integer carId) {
        return carService.deleteCar(userId, carId);
    }


    @GetMapping("/users/{userId}/cars")
    public List<Car> allUserCar(@PathVariable(name = "userId") User userId) {
        return carService.allUserCar(userId);
    }
}
