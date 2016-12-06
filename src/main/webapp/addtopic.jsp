<%--
  Created by IntelliJ IDEA.
  User: Amir
  Date: 2016-10-12
  Time: 12:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Submit topic Form</title>

    <link rel="stylesheet" href="css/styles.css">
    <link rel="stylesheet" href="css/addtopic.css">

</head>


<header>
    <h1>My shop</h1>

</header>
<body>
<ul>
    <li><a href="index.html" class="active">Basic</a></li>
    <li><a href="form-register.html">Register</a></li>
    <li><a href="form-login.html">Login</a></li>

</ul>


<div class="main-content">

    <!-- You only need this form and the form-basic.css -->

    <form class="form-basic" method="post" action="/newtopic.do">

        <div class="form-title-row">
            <h1>New topic</h1>
        </div>

        <div class="form-row">
            <label>
                <span>Title</span>
                <input type="text" name="title">
            </label>
        </div>

        <div class="form-row">
            <label>
                <span>Content</span>
                <textarea name="content"></textarea>
            </label>
        </div>

        <div class="form-row">
            <button type="submit">Post</button>
        </div>

    </form>

</div>

</body>

</html>
