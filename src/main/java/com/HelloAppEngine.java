package com;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet(
    name = "HelloAppEngine",
    urlPatterns = {"/hello"}
)
public class HelloAppEngine extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {

    response.setContentType("text/plain");
    response.setCharacterEncoding("UTF-8");

    response.getWriter().print("Hello App Engine - Class SE!\r\n");

  }
  
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
	  Gson gson = new Gson();
	  String test = "Foooooo";
	  String studentName = request.getParameter("student1");
	  String outPut = "This is an example output from server";
	  response.getWriter().print(gson.toJson(outPut));
	  
  }
  
}