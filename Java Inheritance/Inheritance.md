# 🧬 Inheritance in Java

Inheritance is one of the **four main pillars of Object-Oriented Programming (OOP)** (along with encapsulation, abstraction, and polymorphism).  
It allows a **class (child)** to **inherit** fields and methods from another **class (parent)**.

---

## 🔹 1. What Is Inheritance?

Inheritance allows a new class to reuse the properties and behavior (fields and methods) of an existing class.  
It helps in reducing code duplication and increases reusability.

```java
class Vehicle {
    String brand = "Toyota";

    void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Child class inheriting from Vehicle
class Car extends Vehicle {
    int doors = 4;

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Doors: " + doors);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();     // Inherited method
        c.display();   // Child class method
    }
}
