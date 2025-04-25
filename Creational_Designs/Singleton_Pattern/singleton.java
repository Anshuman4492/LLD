package Singleton_Pattern;

public class singleton {

  public static void main(String[] args) {
    Thread thread1 = new Thread(() -> {
      Logger logger1 = Logger.getInstance();
      logger1.log();
    });
    Thread thread2 = new Thread(() -> {
      Logger logger2 = Logger.getInstance();
      logger2.log();
    });

    thread1.start();
    thread2.start();
    // Two Logger instance ->
    // Logging from Singleton instance: Singleton_Pattern.Logger@6e7767fb
    // Logging from Singleton instance: Singleton_Pattern.Logger@5bd61da5

    // Logger singleton1 = Logger.getInstance();
    // Logger singleton2 = Logger.getInstance();

    // singleton1.log();
    // singleton2.log();
  }
}

class Logger {

  private static Logger instance;

  private Logger() {}

  public static Logger getInstance() {
    if (instance == null) {
      return instance = new Logger();
    }
    return instance;
  }

  public void log() {
    System.out.println("Logging from Singleton instance: " + this);
  }
}
