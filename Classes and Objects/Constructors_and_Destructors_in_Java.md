
# 🚗 Constructors and Destructors in Java

## 🧩 1. Constructor

A **constructor** is a special method used to **initialize objects** when they are created.  
It has **the same name as the class** and **no return type** (not even `void`).

When you create an object with `new`, the constructor runs automatically.

### ✅ Example

```java
public class Voiture {
    String marque;
    int annee;

    // Default constructor (no parameters)
    public Voiture() {
        marque = "Inconnue";
        annee = 0;
        System.out.println("Default constructor called");
    }

    // Constructor with parameters
    public Voiture(String m, int a) {
        marque = m;
        annee = a;
        System.out.println("Constructor with parameters called");
    }

    // Method to display car info
    public void afficherInfos() {
        System.out.println("Marque: " + marque + ", Année: " + annee);
    }
}
```

### 🧠 Explanation

- The **default constructor** sets default values.  
- The **parameterized constructor** allows specific initialization.  
- Constructors are executed **automatically** when objects are created.

### 👇 Usage

```java
public class Main {
    public static void main(String[] args) {
        Voiture v1 = new Voiture(); // calls default constructor
        v1.afficherInfos();

        Voiture v2 = new Voiture("Toyota", 2022); // calls parameterized constructor
        v2.afficherInfos();
    }
}
```

### 🟢 Output

```
Default constructor called
Marque: Inconnue, Année: 0
Constructor with parameters called
Marque: Toyota, Année: 2022
```

---

## 💣 2. Destructor

In **Java**, there is **no explicit destructor** (unlike C++).  
Java uses an automatic system called the **Garbage Collector (GC)**, which destroys objects that are no longer referenced.

### 🧹 Example (old method – deprecated)

```java
class Voiture {
    String marque;
    int annee;

    public Voiture(String m, int a) {
        marque = m;
        annee = a;
        System.out.println("Constructor called");
    }

    @Override
    protected void finalize() {
        System.out.println("Object destroyed by Garbage Collector");
    }
}
```

⚠️ The `finalize()` method was used like a destructor, but it is **deprecated** in modern Java versions because:
- It is **not guaranteed** to run.
- It can cause **performance problems**.

---

## ✅ Summary Table

| Concept | Description | Example |
|----------|--------------|----------|
| **Constructor** | Initializes objects when they are created | `public Voiture(String m, int a)` |
| **Destructor** | Cleans up before object deletion (automatic in Java) | `finalize()` (deprecated) |
| **Garbage Collector** | Deletes unused objects automatically | Runs in the background |
