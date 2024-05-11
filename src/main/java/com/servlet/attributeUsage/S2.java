package com.servlet.attributeUsage;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class S2 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {

        response.setContentType("text/html");
        PrintWriter pr = response.getWriter();
        pr.write("<h1>I am from Servlet 2</h1>");
        int sum = (Integer)request.getAttribute("sum");

        pr.write("<h3>The sum of your number is " + sum + "</h3>");
    }
}
