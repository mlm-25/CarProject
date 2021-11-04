package com.company;

public class Main {

    public static void main(String[] args) {

        Car newCar = new Car();

        newCar.name = "Ferrari";
        newCar.color = "Blue";
        newCar.doors = 3;
        newCar.engineCapacity = "60000cc";

        System.out.println(newCar.color);

    }
}
