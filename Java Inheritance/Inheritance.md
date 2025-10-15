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


---


## 🔹 2. The `@Override` Annotation

`@Override` is used when a **child class** redefines a method that already exists in the **parent class**.  
It tells the compiler that you are **intentionally overriding** a method from the superclass.

This helps prevent errors and improves code readability.

### ✅ Example

```java
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting with a key...");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();  // Output: Car is starting with a key...
    }
}


---

## 🔹 3. Polymorphism 

**Polymorphism** is one of the core concepts of OOP.  
It means **“many forms”** — the same method name can behave differently depending on the **object** that calls it.

In Java, polymorphism allows a **parent class reference** to point to **child class objects**,  
and the correct method implementation is chosen **at runtime**.

---

### ✅ Example

```java
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting with a key...");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting with a button...");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Car();   // Parent reference → Child object
        Vehicle v2 = new Bike();

        v1.start();  // Output: Car is starting with a key...
        v2.start();  // Output: Bike is starting with a button...
    }
}


---

## 🔹 4. The `super` Keyword

The `super` keyword in Java is used to refer to the **parent class (superclass)**.  
It allows the child class to access **methods**, **variables**, and **constructors** from its parent.

---

### 🧩 Uses of `super`

1. **Call a parent class method** (when overridden in the child).  
2. **Access parent class variables** (when shadowed by child variables).  
3. **Call the parent class constructor**.

---

### ✅ Example 1: Calling a Parent Method

```java
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        super.start();  // Calls the parent method first
        System.out.println("Car is now running...");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}
