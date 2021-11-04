package com.company;

public class Main {

    public static void main(String[] args) {

        Car newCar = new Car();


        newCar.name = "Lambooo";
        newCar.engineCapacity = "45678cc";
        newCar.doors = 7;
        newCar.model = "aventador";


        System.out.println(newCar.model);
    }
}
