package com.gmail.aspoka1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(name = "hello", urlPatterns = {"/api/*"})
public class HelloServlet extends HttpServlet {
    private static final String NAME_PARAM = "name";

    private final Logger logger = LoggerFactory.getLogger(HelloServlet.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //logger.info("Hello world!");
        //resp.getWriter().write("Hello world!");

        /*logger.info("Got request with parameters: " + req.getParameterMap());
        String name = Optional.ofNullable(req.getParameter(NAME_PARAM)).orElse("world");
        resp.getWriter().write("Hello " + name + "!");*/

        String name = (req.getParameter(NAME_PARAM) == null) ? "world" : req.getParameter(NAME_PARAM);
        resp.getWriter().write("Hello " + name + "!");
    }
}
