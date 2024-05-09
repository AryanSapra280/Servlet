package com.servlet.submitForm;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h2>Welcome to the page</h2>");
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String gender = request.getParameter("user_gender");

        out.println("<h2> your name: " + userName + "</h2>");
        out.println("<h2> your email: " + email + "</h2>");
        out.println("<h2> your password: " + password + "</h2>");
        out.println("<h2> your gender: " + gender + "</h2>");
        RequestDispatcher rd = request.getRequestDispatcher("index.html");
        rd.include(request,response);
    }
}
