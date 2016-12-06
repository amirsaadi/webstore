package com.saadi.amir.servlest;

import com.saadi.amir.database.Database;
import com.saadi.amir.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * Created by Amir on 2016-10-08.
 *  webstore
 */
@WebServlet(name = "RegisterServlet" ,urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        User user = new User(request.getParameter("name"),
                request.getParameter("email"),
                request.getParameter("password"));

        Database database =new Database();

        database.saveUser(user);
        System.out.println("************************************");

        request.setAttribute("user",user);
        RequestDispatcher dispatcher=request.getRequestDispatcher("home.jsp");
        dispatcher.forward(request,response);

    }

}