package org.example;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Audi","R8",2000);
        Car car = new Car("VW","Polo",1994,4);

        System.out.println(car);
        System.out.println(vehicle);

    }
}