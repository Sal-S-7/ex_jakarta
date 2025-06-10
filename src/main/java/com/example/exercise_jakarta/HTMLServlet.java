package com.example.exercise_jakarta;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "htmlServlet", value = "/html-servlet")
public class HTMLServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "HTML Servlet!";
    }

    String description = "This is an HTML description.";

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<p>" + description + "</p>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}