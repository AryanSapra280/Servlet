package com.servlet.urlReWriting;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ServletB")
public class UrlReWriter2 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>I am second servlet</h1>");
        String name = request.getParameter("name");
        out.println("<h1>Welcome in servletB MR."+name+"</h1>");
    }
}
