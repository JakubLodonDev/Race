package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Car> Car = new ArrayList<>();
        {
            Car.add(new Car("Mustang",28,0,false));
            Car.add(new Car("Porshe",28,0,false));
            Car.add(new Car("Bentley",25,0,false));
            Car.add(new Car("Subaru",21,0,false));
        }

        var Start = new Race(Car);
        var scores = Start.Race();

        System.out.println(scores.CarBrand);

        for (var endCarPosition: scores.EndCarPosition)
        {
            System.out.println(endCarPosition.CarBrand + " " + endCarPosition.EndCarPosition);
        }

        for (var carCrash: scores.CarCrash) {
            System.out.println(carCrash.CarBrand + " is crashed");
        }

        /*for (int i = 0; i < scores.CarCrash.size(); i++) {
            System.out.println(scores.CarCrash.get(i).CarBrand + " is crashed");
        }*/

    }
}
