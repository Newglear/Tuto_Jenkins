package com.example.demo;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "LoginVerifiy", value = "/com.example.demo.LoginVerify")
public class LoginVerify extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("uname");
        String pwd = request.getParameter("password");
        if(name.equals("Gwen") && pwd.equals("1")){
            System.out.println("Accès autorisé");
        }else{
            System.out.println("Nope mon bro");
        }
    }
}
