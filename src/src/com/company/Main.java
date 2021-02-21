package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Car> Cars = new ArrayList<>();
        {
            Cars.add(new Car("Mustang",28,0,false));
            Cars.add(new Car("Porshe",27,0,false));
            Cars.add(new Car("Bentley",28,0,false));
            Cars.add(new Car("Subaru",21,0,false));
        }

        var start = new Race(Cars);
        var scores = start.Race();

        System.out.println(scores.WinnerCarBrand);

        for (var endCarPosition: scores.EndCarPosition)
        {
            System.out.println(endCarPosition.CarBrand + " "
                    + endCarPosition.EndCarPosition);
        }

        for (var Crash: scores.Crash) {
            System.out.println(Crash.FirstCarBrand + " was crashed with "
                    + Crash.SecendCarBrand +" on "+ Crash.CrashPosition +" meter");
        }

        /*for (int i = 0; i < scores.CarCrash.size(); i++) {
            System.out.println(scores.CarCrash.get(i).CarBrand + " is crashed");
        }*/

    }
}
