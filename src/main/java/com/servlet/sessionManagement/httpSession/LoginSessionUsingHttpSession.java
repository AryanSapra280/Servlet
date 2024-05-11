package com.servlet.sessionManagement.httpSession;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginSessionUsingHttpSession extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("logout");
        if(session != null) {
            requestDispatcher.include(request,response);
            return;
        }
        session = request.getSession();
        session.setAttribute("name",request.getParameter("username"));
        session.setAttribute("password",request.getParameter("password"));
        requestDispatcher.include(request,response);
    }
}
