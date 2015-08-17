package com.michelpm;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.tagext.SimpleTagSupport;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;

public class HelloTagHandler extends SimpleTagSupport {

  private String from;

  public void setFrom(String from) {
    this.from = from;
  }

  @Override
  public void doTag() throws JspException, IOException {
    JspWriter out = getJspContext().getOut();
    if (from != null) {
      out.println("Hello World from " + this.from + "!");
    } else {
      StringWriter sw = new StringWriter();
      getJspBody().invoke(sw);
      out.println("Hello World from " + sw.toString() + "!");
    }
  }

}
