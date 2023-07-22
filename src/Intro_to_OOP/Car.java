package Intro_to_OOP;

public class Car {

    // attributes list the features of the car

    String make = "Chevrolet";
    String model = "Corvette";
    int year = 2020;
    String color = "blue";
    double price = 50000.00;

    // methods define the actions of the car

    void drive() {
        System.out.println("you drive the car");
    }

    void brake() {
        System.out.println("you step on the brakes");
    }
}

class Main {
    public static void main(String[] args) {

        // Object(myCar1) = an instance of a class(Car) that may contain attributes(characteristics) and methods(actions)
        // example: (Car, phone, desk, computer, coffee cup)

        Car myCar1 = new Car();
        Car myCar2 = new Car();
        System.out.println(myCar1.make);
        System.out.println(myCar1.model);
        System.out.println();
        System.out.println(myCar2.make);
        System.out.println(myCar2.model);

        // myCar.drive();
        //myCar.brake();


    }
}