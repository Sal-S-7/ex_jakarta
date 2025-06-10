package com.example.exercise_jakarta;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet(name = "page1Servlet", value = "/page1")
public class Page1Servlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.setAttribute("pageTitle", "Ma Page 1");
        getServletContext().getRequestDispatcher("/jsp/page1.jsp").forward(req, resp);
    }
}