package com.example.exercise_jakarta;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet(name = "page2Servlet", value = "/page2")
public class Page2Servlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.setAttribute("pageTitle", "Ma Page 2");
        getServletContext().getRequestDispatcher("/jsp/page2.jsp").forward(req, resp);
    }
}
