
import java.util.Scanner;
class Vehicle {

    // Vehicle attribute
    public String brand;      
    public String color;   
    public String speed;

  public Vehicle(String brand, String color, String speed) {

                this.brand = brand;
                this.color = color;
                this.speed = speed; 
  }
  public void inputData(){

        Scanner input = new Scanner(System.in); 
        System.out.print("brand the car :");
        brand = input.nextLine();

        System.out.print("color the car :");
        color = input.nextLine();

        System.out.print("speed the car :");
        speed = input.nextLine();
  }
  // Vehicle method
  public void honk() {                    
    System.out.println("Tuut, tuut!");
  }
}
