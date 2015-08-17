package com.michelpm;

public class HelloWorldException extends javax.servlet.ServletException {
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
}
