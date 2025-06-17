/*
 * Task No: 1
 * Task Name: Create a Car class using a constructor
 * Objective: Create a Car class with attributes (brand, model, price),
 *            initialize them using a constructor, and display details using a method.
 */

public class Car {
    // Instance variables
    String brand;
    String model;
    double price;

    // Constructor
    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display car details
    public void displayCar() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Car Price: $" + price);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Mark2", 1200000.00);
        myCar.displayCar();
    }
}
