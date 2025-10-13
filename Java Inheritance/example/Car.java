class Car extends Vehicle {
  public String type = "car";   
   
  public Car() {
    super("", "", "");
}


  public static void main(String[] args) {

    Car myCar = new Car();
    myCar.inputData();

    myCar.honk();
    System.out.println(myCar.type + " " + myCar.brand + " " + myCar.color+ " " + myCar.speed);
  }
}
