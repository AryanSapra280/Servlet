package com.servlet.attributeUsage;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class S1 extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int a = Integer.parseInt(request.getParameter("n1"));
        int b = Integer.parseInt(request.getParameter("n2"));
        int sum = a + b;
        request.setAttribute("sum",sum);
        RequestDispatcher rd = request.getRequestDispatcher("s2");
        rd.forward(request,response);
    }
}
