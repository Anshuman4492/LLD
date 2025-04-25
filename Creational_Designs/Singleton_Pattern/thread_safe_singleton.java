package Singleton_Pattern;

public class thread_safe_singleton {

  public static void main(String[] args) {
    Thread thread1 = new Thread(() -> {
      ThreadSafeLogger logger1 = ThreadSafeLogger.getInstance();
      logger1.log();
    });
    Thread thread2 = new Thread(() -> {
      ThreadSafeLogger logger2 = ThreadSafeLogger.getInstance();
      logger2.log();
    });

    thread1.start();
    thread2.start();
  }
}

class ThreadSafeLogger {

  private static volatile ThreadSafeLogger instance;

  private ThreadSafeLogger() {}

  public static ThreadSafeLogger getInstance() {
    if (instance == null) {
      synchronized (Logger.class) {
        if (instance == null) instance = new ThreadSafeLogger();
      }
    }
    return instance;
  }

  public void log() {
    System.out.println("Logging from Singleton instance: " + this);
  }
}
