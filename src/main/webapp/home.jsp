<%@ page import="com.saadi.amir.model.User" %>
<%@ page import="com.saadi.amir.database.Database" %>
<%@ page import="java.util.List" %>
<%@ page import="com.saadi.amir.model.Topic" %>

<%--
  Created by IntelliJ IDEA.
  User: Amir
  Date: 2016-10-10
  Time: 23:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>home</title>

    <link rel="stylesheet" href="css/styles.css">
    <link rel="stylesheet" href="css/home.css">


</head>

<body>

<header>
    <h1>My shop</h1>
</header>

<ul>
    <li><a href="index.jsp" class="active">Home</a></li>
    <li><a href="register.jsp">Register</a></li>
    <li><a href="login.jsp">Login</a></li>

</ul>

<div class="main-content">

    <%  User user = (User) request.getAttribute("user");

        String name="";
        if (user!=null){name=user.getName();}
        session.setAttribute("loggedInUser",user);
        Database database= new Database();
        List<Topic> list =database.getTopics();
    %>
    <h1> Welcome <%= name%></h1>
    <a href="addtopic.jsp" class="amir">Add new topic</a>
    <%
     for (int i=0;i<list.size();i++){%>
    <div class="topic-box">
        <div class="from-topicbov"  >
            <div class="form-topic-title">
                <h1><%= list.get(i).getTitle()%></h1>
            </div>
            <div class="form-row">
                <label>
                    <p name="textarea"><%= list.get(i).getContent()%></p>
                    <div class="date">
                        <p><%= list.get(i).getDate()%></p>
                        <p><%= list.get(i).getAuthor()%></p>
                    </div>
                </label>
            </div>
            <div class="form-row">
                <button type="submit" action="#">comment</button>
            </div>
        </div>
    </div>
    <div>
        <p>.  </p>
    </div>
    <% };%>
</div>
</body>
</html>
