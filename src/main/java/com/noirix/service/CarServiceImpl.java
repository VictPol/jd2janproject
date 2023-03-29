package com.noirix.service;

import com.noirix.domain.Car;
import com.noirix.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    public Integer getNumberOfCarsByUserId(Long user_id) {
        return carRepository.getNumberOfCarsByUserId(user_id);
    }

    public void changeCarsIsDeletedStatusByUserId(Long user_id) {
        carRepository.changeCarsIsDeletedStatusByUserId(user_id);
    }

    @Override
    public Car findOne(Long id) {
        return carRepository.findOne(id);
    }

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public List<Car> findAll(int page, int offset) {
        return carRepository.findAll(page, offset);
    }

    @Override
    public Car create(Car object) {
        return carRepository.create(object);
    }

    @Override
    public Car update(Car object) {
        return carRepository.update(object);
    }

    @Override
    public void delete(Long id) {
        carRepository.delete(id);
    }

    @Override
    public List<Car> searchCar(String query, Float price) {
        return carRepository.searchCar(query.toLowerCase(), price);
    }
}
