package com.michelpm;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends javax.servlet.http.HttpServlet {
  public void destroy() {
    super.destroy();
  }

  public void init()
    throws javax.servlet.ServletException {
    super.init();
  }

  public void service(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("text/html;charset=utf-8");
    PrintWriter writer = response.getWriter();
    writer.println("<!DOCTYPE html>");
    writer.println("<html lang=\"en\">");
    writer.println("  <head>");
    writer.println("    <meta charset=\"utf-8\">");
    writer.println("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
    writer.println("    <title>Hello World</title>");
    writer.println("  </head>");
    writer.println("  <body>");
    writer.println("    <h1>Hello World</h1>");
    writer.println("    <p>Quod Erat Demonstrandum</p>");
    writer.println("  </body>");
    writer.println("</html>");
    writer.close();
  }
}
