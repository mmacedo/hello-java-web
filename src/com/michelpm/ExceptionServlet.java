package com.michelpm;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

public class ExceptionServlet extends javax.servlet.http.HttpServlet {
  @Override
  public void destroy() {
    super.destroy();
  }

  @Override
  public void init(ServletConfig config)
    throws javax.servlet.ServletException {
    super.init();
  }

  @Override
  public void service(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    throw new HelloWorldException();
  }
}
