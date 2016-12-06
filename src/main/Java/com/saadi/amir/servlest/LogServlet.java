package com.saadi.amir.servlest;

import com.saadi.amir.database.Database;
import com.saadi.amir.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Amir on 2016-10-11.
 *  webstore
 */
@WebServlet(name = "LogServlet" ,urlPatterns = "/login")
public class LogServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name,email,password ;
        name= request.getParameter("name");
        email=request.getParameter("email");
        password=request.getParameter("password");
        User user = new User(name,email,password);
        Database database =new Database();
        List<User> userList =database.getUserByEmail(email);

        request.setAttribute("user",user);
        if (userList.size()==0){

            RequestDispatcher dispatcher=request.getRequestDispatcher("guestHome.jsp");
            dispatcher.forward(request,response);
        }
        if (userList.get(0).getPassword().equals(password)){
            user.setName(userList.get(0).getName());
            request.setAttribute("user",user);
            System.out.println("username: "+user.getName());
            System.out.println("user  :"+user);
            RequestDispatcher dispatcher=request.getRequestDispatcher("home.jsp");
            dispatcher.forward(request,response);
        }
        if (!userList.get(0).getPassword().equals(password)){

            RequestDispatcher dispatcher=request.getRequestDispatcher("wrongPassword.jsp");
            dispatcher.forward(request,response);
        }
       // Stream.of(database.getUser()).forEach(System.out::println);

    }
/*
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }*/
}
