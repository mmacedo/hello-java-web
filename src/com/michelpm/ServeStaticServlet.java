package com.michelpm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class ServeStaticServlet extends javax.servlet.http.HttpServlet {
  public void destroy() {
    super.destroy();
  }

  public void init(ServletConfig config)
    throws javax.servlet.ServletException {
    super.init();
  }

  @Override
  public void service(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    String urlPath = request.getPathInfo();
    if (urlPath == null) {
      urlPath = "/index.html";
    } else if (urlPath.endsWith("/")) {
      urlPath += "index.html";
    }

    ServletContext context = request.getSession().getServletContext();
    try (
      PrintWriter writer    = response.getWriter();
      InputStream inStream  = context.getResourceAsStream("/WEB-INF/public" + urlPath);
      BufferedReader reader = new BufferedReader(new InputStreamReader(inStream));
    ) {
      String mimeType = java.net.URLConnection.guessContentTypeFromStream(inStream);
      response.setContentType(mimeType);

      String line;
      while ((line = reader.readLine()) != null) {
        writer.println(line);
      }
    }
  }
}
