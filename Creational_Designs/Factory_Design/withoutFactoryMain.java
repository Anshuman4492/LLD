package Factory_Design;
public class withoutFactoryMain {

  public static void main(String[] args) {
    MotorVehicle car = new Car();
    car.start();
    car.stop();

    MotorVehicle bike = new Bike();

    bike.start();
    bike.stop();
  }
}

class Car extends MotorVehicle {

  @Override
  public void start() {
    System.out.println("Car started");
  }

  public void stop() {
    System.out.println("Car stopped");
  }
}

class Truck extends MotorVehicle {

  @Override
  public void start() {
    System.out.println("Truck started");
  }

  public void stop() {
    System.out.println("Truck stopped");
  }
}

class Bike extends MotorVehicle {

  @Override
  public void start() {
    System.out.println("Bike started");
  }

  public void stop() {
    System.out.println("Bike stopped");
  }
}

interface Vehicle {
  void move();
}

class MotorVehicle implements Vehicle {

  @Override
  public void move() {
    System.out.println("Motor vehicle is moving");
  }

  void start() {
    System.out.println("Vehicle started");
  }

  void stop() {
    System.out.println("Vehicle stopped");
  }
}
