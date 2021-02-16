package com.company;

import java.util.ArrayList;

public class Score {
    String CarBrand;
    ArrayList<EndCarPosition> EndCarPosition;
    ArrayList<CarCrash> CarCrash;

    public Score(String carBrand, ArrayList<com.company.EndCarPosition> endCarPosition, ArrayList<com.company.CarCrash> carCrash) {
        CarBrand = carBrand;
        EndCarPosition = endCarPosition;
        CarCrash = carCrash;
    }
}
