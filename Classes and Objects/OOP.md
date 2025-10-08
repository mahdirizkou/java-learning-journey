# OOP Object-Oriented Programming JAVA :

OOP stands for Object-Oriented Programming.
It’s a programming paradigm (a way of writing programs) that organizes code around objects rather than just functions and logic.

## Classes&Objects:

#### Class:

A class in Java is a blueprint or template for creating objects.
It defines what attributes (variables) and behaviors (methods) an object will have.

#### Example for class :
```text
public class Car {
    // Attributes (fields)
    String color;
    int year;

    // Behavior (method)
    void drive() {
        System.out.println("The car is driving");
    }
}
```
#### Object:

An object is a real instance of a class.
If a class is a blueprint, then an object is the actual thing built from that blueprint.
It has attributes (data) and behaviors (methods) defined by its class.

#### Example for class :
```text
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();   // create object
        myCar.color = "Red";
        myCar.year = 2020;

        System.out.println("Color: " + myCar.color);
        myCar.drive();  // call method
    }
}
```