<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Header Page</title>

<style>
    body{
        margin:0;
        font-family: Arial, sans-serif;
    }

    .header{
        background-color:blue;
        color:white;
        padding:8px;
        text-align:center;
    }

    .navbar{
        background-color:#333;
        overflow:hidden;
    }

    .navbar a{
        float:Right;
        display:block;
        color:white;
        text-align:center;
        padding:14px 20px;
        text-decoration:none;
    }

    .navbar a:hover{
        background-color:#575757;
    }
</style>

</head>

<body>

<div class="header">
    <h1>My JSP Website</h1>
</div>

<div class="navbar">
    <a href="contact.jsp">Contact</a>
    <a href="services.jsp">Services</a>
    <a href="about.jsp">About</a>
    <a href="index.jsp">Home</a>
</div>

<%
int x=10;
int y=20;
int add = x + y;
int Sub = x - y;
int mul = x * y;
int Div = x * y;
out.println("<p style='color: blue; font-size: 20px; font-weight: bold;'>Addition: " + add + "</p>");
out.println("<p style='color: green; font-size: 20px; font-weight: bold;'>sub: " + Sub + "</p>");
out.println("<p style='color: red; font-size: 20px; font-weight: bold;'>Mul: " + mul + "</p>");
out.println("<p style='color: Yellow; font-size: 20px; font-weight: bold;'>Divs: " + Div + "</p>");
%>

</body>
</html>