public class withFactoryMain {
  public static void main(String[] args) {
    MotorVehicleFactory factory = new MotorVehicleFactory();
    MotorVehicle car = factory.createVehicle(VehicleType.Car);

    car.start();
    car.stop();

    MotorVehicle bike = factory.createVehicle(VehicleType.Bike);

    bike.start();
    bike.stop();
  }
}

// Factory for creating vehicles
// Can be extended to create more vehicles

class MotorVehicleFactory extends MotorVehicle {

  public MotorVehicle createVehicle(VehicleType vehicle) {
    if (vehicle.equals(VehicleType.Car)) {
      return new Car();
    } else if (vehicle.equals(VehicleType.Bike)) {
      return new Bike();
    } else if (vehicle.equals(VehicleType.Truck)) {
      return new Truck();
    } else throw new IllegalArgumentException("Invalid Vehicle Type");
  }
}

enum VehicleType {
  Bike,
  Car,
  Truck,
}
