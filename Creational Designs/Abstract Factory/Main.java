public class Main {

  public static void main(String[] args) {
    VehicleFactory toyota = new ToyotaFactory();
    MotorVehicle toyotaCar = toyota.createVehicle();

    toyotaCar.start();
    toyotaCar.stop();

    VehicleFactory bmw = new BMWFactory();
    MotorVehicle bike = bmw.createVehicle();

    bike.start();
    bike.stop();
  }
}

interface VehicleFactory {
  MotorVehicle createVehicle();
}

class ToyotaFactory implements VehicleFactory {

  @Override
  public MotorVehicle createVehicle() {
    return new Toyota();
  }
}

class Toyota extends MotorVehicle {

  public void start() {
    System.out.println("Toyota started");
  }

  public void stop() {
    System.out.println("Toyota stopped");
  }
}

class BMWFactory implements VehicleFactory {

  @Override
  public MotorVehicle createVehicle() {
    return new BMW();
  }
}

class BMW extends MotorVehicle {

  public void start() {
    System.out.println("BMW started");
  }

  public void stop() {
    System.out.println("BMW stopped");
  }
}

class RangeRoverFactory implements VehicleFactory {

  @Override
  public MotorVehicle createVehicle() {
    return new RangeRover();
  }
}

class RangeRover extends MotorVehicle {

  public void start() {
    System.out.println("RangeRover started");
  }

  public void stop() {
    System.out.println("RangeRover stopped");
  }
}
