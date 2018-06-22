package com.cursor.mainproject.domain.repository;

import com.cursor.mainproject.domain.model.Car;
import com.cursor.mainproject.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Integer> {

    List<Car> findAllByUserId(User userId);

}
