package com.michelpm;

public class HelloWorldException extends Exception {
  public HelloWorldException() {
  }

  public HelloWorldException(String message) {
    super(message);
  }

  public HelloWorldException(Throwable cause) {
    super(cause);
  }

  public HelloWorldException(String message, Throwable cause) {
    super(message, cause);
  }

  public static void boom() throws HelloWorldException {
    throw new HelloWorldException();
  }
}
