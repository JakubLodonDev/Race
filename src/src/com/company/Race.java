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
                        var car1 = Cars.get(j);
                        var car2 = Cars.get(k);

                        if (car1.CarPosition == car2.CarPosition) {
                            Crash.add(new Crash(car1.CarBrand, car2.CarBrand,
                                    car1.CarPosition, true));
                            car1.SetIsCrashed(); car2.SetIsCrashed();
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
            var carCanWin = Cars.get(i);
            if(winnerCar.CarPosition < carCanWin.CarPosition && carCanWin.CanMove())
            {
                winnerCar = carCanWin;
            }
        }

        return new Score(winnerCar.CarBrand, endPosition, Crash);
    }
}
