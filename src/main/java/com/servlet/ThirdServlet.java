package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ThirdServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("I am a get request");
        response.setContentType("text/html"); //text jo html type ka hoga
        PrintWriter out = response.getWriter();
        out.println("<h1>I am from get Method</h1>");
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>I am from post method</h1>");
    }
}
