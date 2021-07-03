package com.sda.andreanaghi.startup.service;

import com.sda.andreanaghi.startup.service.dto.CarDTO;

public interface CarService {

    /**
     * Create a new car for the given carDTO.
     *
     * @param carDTO, details of the new car
     * @return the id of the newly created car
     */
    Long addCar(CarDTO carDTO);
}
