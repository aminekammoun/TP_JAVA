package com.directi.training.srp.exercice_refactored;

import com.directi.training.srp.exercise.Car;

import java.util.ArrayList;

public class CarAnalyser {
	
	public Car getBestCar(ArrayList<Car> cars)
    {
        Car bestCar = null;
        for (Car car : cars) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
