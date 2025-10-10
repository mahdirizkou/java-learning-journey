# 🧮 Exercise 1: Modeling a Segment

- We want to create an application that allows us to manipulate line segments.  
- A segment is defined by the values of its two endpoints: **extr1** and **extr2**.  
- To create a segment, you must specify the values of **extr1** and **extr2**.  

---

## 🔹 The operations we want to perform on the segment are:

- **ordonne()** → Method that arranges **extr1** and **extr2** if **extr1** is greater than **extr2**.  
- **getLongueur()** → Method that returns the length of the segment.  
- **appartient(int x)** → Returns whether the point *x* belongs to the segment or not.  
- **Affiche()** → Displays the state of the object as a string in the format:  
  `SEGMENT[extr1, extr2]`.

---

## 🔸 Implementation instructions

- Implement a class named **Segment**.

- Create an application **Demo_Segment** that performs the following:
  1. Create an object of the class `Segment` with the values **extr1 = 24** and **extr2 = 12**.  
  2. Display the length of this segment.  
  3. Display whether the point **x = 15** belongs to this segment.  
  4. Change the values of the two endpoints of the segment.  
  5. Display the length of the segment again.

---

## 🧠 Task (TP)
Implement a **toString()** method that returns a string in the format  
`SEGMENT[extr1, extr2]`  
instead of using **Affiche()**.

---

## ✅ Solution Hint
After compiling your files, **run the program using the command below**:

```bash
java Demo.java
```
