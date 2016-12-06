<%--
  Created by IntelliJ IDEA.
  User: Amir
  Date: 2016-10-11
  Time: 11:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Login Form</title>

    <link rel="stylesheet" href="css/styles.css">
    <link rel="stylesheet" href="css/wrongPass.css">

</head>

<body>
<header>
    <h1>My shop</h1>

</header>

<ul>
    <li><a href="index.jsp" >Home</a></li>
    <li><a href="register.jsp">Register</a></li>
    <li><a href="login.jsp" class="active">Login</a></li>

</ul>


<div class="main-content">

    <!-- You only need this form and the form-login.css -->

    <form class="form-login" method="post" action="/login">

        <div class="form-log-in-with-email">

            <div class="form-white-background">

                <div class="form-title-row">
                    <h2>Wrong password ! please try again.</h2>

                </div>

                <div class="form-row">
                    <label>
                        <span>Email</span>
                        <input type="email" name="email">
                    </label>
                </div>

                <div class="form-row">
                    <label>
                        <span>Password</span>
                        <input type="password" name="password">
                    </label>
                </div>

                <div class="form-row">
                    <button type="submit">Log in</button>
                </div>

            </div>

            <a href="#" class="form-forgotten-password">Forgotten password </a>
            <a href="register.jsp" class="form-create-an-account">Create an account </a>

        </div>



    </form>

</div>

</body>

</html>
