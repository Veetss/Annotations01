package it.develhope.annotations;

public class Main {

    //@SuppressWarnings("deprecation")

    public static void main(String[] args) {
        Car car = new Car("Aston Martin db11", 1560.40);

        car.printCarDetails();
        car.getCarDetails();
    }
}