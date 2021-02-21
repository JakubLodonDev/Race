package com.company;

public class Car {
    String CarBrand;
    Integer CarSpeed;
    Integer CarPosition;
    Boolean Crash;

    public Car(String carBrand, Integer carSpeed, Integer carPosition, Boolean crash) {
        CarBrand = carBrand;
        CarSpeed = carSpeed;
        CarPosition = carPosition;
        Crash = crash;
    }

    public void Move()
    {
        CarPosition= CarPosition + CarSpeed;
    }

    public boolean CanMove()
    {
     return !Crash;
    }
}
