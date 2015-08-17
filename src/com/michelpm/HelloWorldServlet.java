package com.michelpm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

public class HelloWorldServlet extends javax.servlet.http.HttpServlet {
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
    response.setContentType("text/html;charset=utf-8");
    try (
      PrintWriter writer = response.getWriter();
    ) {
      writer.println("<!DOCTYPE html>");
      writer.println("<html lang=\"en\">");
      writer.println("  <head>");
      writer.println("    <meta charset=\"utf-8\">");
      writer.println("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
      writer.println("    <title>Hello World - Servlet</title>");
      writer.println("  </head>");
      writer.println("  <body>");
      writer.println("    <h1>Hello World from Servlet!</h1>");
      writer.println("    <p>Quod Erat Demonstrandum</p>");
      writer.println("  </body>");
      writer.println("</html>");
    }
  }
}
