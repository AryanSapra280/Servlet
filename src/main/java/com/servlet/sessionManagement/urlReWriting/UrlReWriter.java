package com.servlet.sessionManagement.urlReWriting;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servletA")
public class UrlReWriter extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter pr = response.getWriter();
        pr.println("<h1>I am taking input</h1>");
        String name = request.getParameter("name");
        String urlPatternRewriting = String.format("ServletB?name=%s",name);
//        pr.println("<a href =" + urlPatternRewriting + " >Go to second servlet</a>"); // one way which I did but better way is given below
        pr.println("<a href='ServletB?name="+name+"'>Go to second servlet</a>"); // "+val+" // this becomes dynamic
    }
}
