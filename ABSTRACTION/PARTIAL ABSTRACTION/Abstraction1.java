/*
Design a Vehicle system using partial abstraction:

- Create abstract class Vehicle
    abstract method start()
    normal method fuelType()

- Create subclass Car
    implement start()

- Display both methods
*/

abstract class Vehicle {
    abstract void start();

    void fuelType() {
        System.out.println("fuel Type: Petrol/Diesel");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("car starts with key");
    }
}

class Abstraction1 {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.fuelType();
    }
}
