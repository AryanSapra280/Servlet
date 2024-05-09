package com.servlet.sessionManagement.cookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CookieOne extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie[]cookies = request.getCookies();
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        if(cookies == null) {
            String name = request.getParameter("name");
            String age = request.getParameter("age");

            out.println("<h1>I am from servlet CookieOne</h1>");
            out.println("<h2>The name is " + name + "</h2>");
            out.println("<h2><a href = \"cookie2\">Press Here</a></h2>");
            Cookie cookie = new Cookie("name",name);
            response.addCookie(cookie);
        }
        else {
            out.println("<h1>Welcome back</h1>");
            for(Cookie cookie:cookies) {
                out.println("<h2>Mr. " + cookie.getValue() + "</h2>");
            }

        }

    }
}
