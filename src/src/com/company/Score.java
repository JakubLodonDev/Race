package com.company;

import java.util.ArrayList;

public class Score {
    String WinnerCarBrand;
    ArrayList<EndCarPosition> EndCarPosition;
    ArrayList<Crash> Crash;

    public Score(String winnerCarBrand, ArrayList<com.company.EndCarPosition> endCarPosition, ArrayList<com.company.Crash> crash) {
        WinnerCarBrand = winnerCarBrand;
        EndCarPosition = endCarPosition;
        Crash = crash;
    }
}
