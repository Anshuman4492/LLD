package Builder_Design;

public class Main {

  public static void main(String[] args) {
    Car.CarBuilder carBuilder = new Car.CarBuilder();
    Car car1 = carBuilder
      .setEngine("V8")
      .setColor("white")
      .setWheels(4)
      .setSunroof(true)
      .build();

    System.out.println(car1);

    Car car2 = carBuilder
      .setEngine("V6")
      .setColor("red")
      .setWheels(4)
      .setSunroof(false)
      .setStereo(true)
      .build();

    System.out.println(car2);
  }
}

class Car {

  private String color;
  private String engine;
  private int wheels;
  private boolean hasSunroof;
  private boolean hasStereo;

  private Car(CarBuilder builder) {
    this.color = builder.color;
    this.engine = builder.engine;
    this.wheels = builder.wheels;
    this.hasSunroof = builder.hasSunroof;
    this.hasStereo = builder.hasStereo;
  }

  @Override
  public String toString() {
    return (
      "Car [engine=" +
      engine +
      ", wheels=" +
      wheels +
      ", color=" +
      color +
      ", sunroof=" +
      hasSunroof +
      ", stereoSystem=" +
      hasStereo +
      "]"
    );
  }

  static class CarBuilder {

    private String color = "black";
    private String engine;
    private int wheels = 4;
    private boolean hasSunroof = false;
    private boolean hasStereo = false;

    public Car build() {
      return new Car(this);
    }

    public CarBuilder setColor(String color) {
      this.color = color;
      return this;
    }

    public CarBuilder setEngine(String engine) {
      this.engine = engine;
      return this;
    }

    public CarBuilder setWheels(int wheels) {
      this.wheels = wheels;
      return this;
    }

    public CarBuilder setSunroof(boolean hasSunroof) {
      this.hasSunroof = hasSunroof;
      return this;
    }

    public CarBuilder setStereo(boolean hasStereo) {
      this.hasStereo = hasStereo;
      return this;
    }
  }
}
