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
            int x=0;
            for (var cars : Cars) {
                if(Cars.get(x).Crash.equals(false)) {
                    cars.CarPosition = cars.CarPosition + cars.CarSpeed;
                }
                x++;
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
        int y=0;

        for (var car: Cars) {
            if(Cars.get(y).Crash.equals(false)) {
                endPosition.add(new EndCarPosition(car.CarBrand, car.CarPosition));
            }
            y++;
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
