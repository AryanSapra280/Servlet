package com.servlet.sessionManagement.httpSession;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/logout")
public class LogoutSessionUsingHttpSession extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        String name = (String)session.getAttribute("name");
        out.println("<h1>Welcome back "+name+"");
        out.println("<form action='finalPage'>");
        out.println("<button type='submit'>logout</button>");//finalPage is to invalidate Session data
        out.println("</form>");

    }
}
