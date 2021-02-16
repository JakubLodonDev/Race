package com.company;

import java.util.ArrayList;

public class Race {
    ArrayList<Car> Cars;

    public Race(ArrayList<Car> cars) {
        Cars = cars;
    }
    Score Race()
    {
        ArrayList<CarCrash> carCrash = new ArrayList<>();

        for (int i = 0; i < 60; i++) {
            for (var cars : Cars) {
                cars.CarPosition = cars.CarPosition + cars.CarSpeed;
            }
            for (int j = 0; j < Cars.size()-1; j++) {
                if(Cars.get(j).Crash.equals(false)) {
                    for (int k = 1 + j; k < 4; k++) {
                        if (Cars.get(j).CarPosition == Cars.get(k).CarPosition) {
                            carCrash.add(new CarCrash(Cars.get(j).CarBrand, true));
                            Cars.get(j).Crash=true;
                            carCrash.add(new CarCrash(Cars.get(k).CarBrand, true));
                            Cars.get(k).Crash=true;
                            break;
                        }
                    }
                }
            }
        }

        ArrayList<EndCarPosition> endPosition = new ArrayList<>();

        for (var car: Cars) {
            endPosition.add(new EndCarPosition(car.CarBrand, car.CarPosition));
        }

        Car winnerCar = null;
        for (int i = 0; i < Cars.size(); i++) {
            if(Cars.get(i).Crash.equals(false))
            {
                winnerCar = Cars.get(i);
            }
        }

        for (int i = 0; i < Cars.size(); i++) {
            if(winnerCar.CarPosition < Cars.get(i).CarPosition && Cars.get(i).Crash.equals(false))
            {
                winnerCar = Cars.get(i);
            }
        }

        return new Score(winnerCar.CarBrand, endPosition, carCrash);
    }
}
