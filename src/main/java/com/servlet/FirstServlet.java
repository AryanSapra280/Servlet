package com.servlet;

import jakarta.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet implements Servlet{
    private ServletConfig config;
    @Override
    public void init(ServletConfig config) {
        this.config = config;
        System.out.println("Initializations");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("Servicing........");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>I am writing from service class</h1>");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("Destroying........");
    }

}
