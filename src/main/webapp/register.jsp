<%--
  Created by IntelliJ IDEA.
  User: Amir
  Date: 2016-10-10
  Time: 23:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Registration Form</title>

    <link rel="stylesheet" href="css/styles.css">
    <link rel="stylesheet" href="css/register.css">

</head>


<header>
    <h1>My shop</h1>
</header>

<ul>
    <li><a href="index.jsp" >Home</a></li>
    <li><a href="register.jsp"class="active">Register</a></li>
    <li><a href="login.jsp">Login</a></li>

</ul>

<body>
<div class="main-content">

    <!-- You only need this form and the form-register.css -->

    <form class="form-register" method="post" action="/register">

        <div class="form-register-with-email">

            <div class="form-white-background">

                <div class="form-title-row">
                    <h1>Create an account</h1>
                </div>

                <div id="name" class="form-row">
                    <label>
                        <span>Name</span>
                        <input type="text" name="name">
                    </label>
                </div>

                <div id="email" class="form-row">
                    <label>
                        <span>Email</span>
                        <input type="email" name="email">
                    </label>
                </div>

                <div id="password"class="form-row">
                    <label>
                        <span>Password</span>
                        <input type="password" name="password">
                    </label>
                </div>



                <div class="form-row">
                    <button type="submit">Register</button>
                </div>

            </div>


        </div>

    </form>

</div>

</body>

</html>

