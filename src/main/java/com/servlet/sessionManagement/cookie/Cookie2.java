package com.servlet.sessionManagement.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cookie2")
public class Cookie2 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>I am from cookie 2 servlet</h1>");
        Cookie[]cookies = request.getCookies();
        if(cookies!=null) {
            for(Cookie cookie:cookies) {
                out.println("<h2>the COOKIE name I got " + cookie.getValue() + "</h2>");
            }
        }

    }
}
