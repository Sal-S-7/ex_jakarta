package com.example.exercise_jakarta;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "plainServlet", value = "/plain-servlet")
public class PlainServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Plain Servlet!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/plain");

        PrintWriter out = response.getWriter();
        out.println(message);

    }

    public void destroy() {
    }
}