package com.company;

import java.util.ArrayList;

public class Race {
    ArrayList<Car> Cars;

    public Race(ArrayList<Car> cars) {
        Cars = cars;
    }
    Score Race()
    {
        ArrayList<Crash> Crash = new ArrayList<>();

        for (int i = 0; i < 60; i++) {
            int x=0;
            for (var cars : Cars) {
                if(cars.CanMove()) {
                    cars.Move();
                }
                x++;
            }
            for (int j = 0; j < Cars.size()-1; j++) {
                if(Cars.get(j).CanMove()) {
                    for (int k = 1 + j; k < Cars.size(); k++) {
                        if (Cars.get(j).CarPosition == Cars.get(k).CarPosition) {
                            Crash.add(new Crash(Cars.get(j).CarBrand,Cars.get(k).CarBrand,
                                    Cars.get(j).CarPosition, true));
                            Cars.get(j).Crash=true;
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
            if(Cars.get(y).CanMove()) {
                endPosition.add(new EndCarPosition(car.CarBrand, car.CarPosition));
            }
            y++;
        }

        Car winnerCar = null;
        for (int i = 0; i < Cars.size(); i++) {
            if(Cars.get(i).CanMove())
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

        return new Score(winnerCar.CarBrand, endPosition, Crash);
    }
}
