package com.saadi.amir.servlest;

import com.saadi.amir.database.Database;
import com.saadi.amir.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Amir on 2016-10-12.
 *  webstore
 */
@WebServlet(name = "AddTopicServlet",urlPatterns = "/newtopic.do")
public class AddTopicServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session=request.getSession();
        User user =(User) session.getAttribute("loggedInUser");

        Database database =new Database();
        database.addNewTopic(user,request.getParameter("title"),request.getParameter("content"));


        request.setAttribute("user",user);
        RequestDispatcher dispatcher=request.getRequestDispatcher("home.jsp");
        dispatcher.forward(request,response);
    }

    /*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }*/
}
