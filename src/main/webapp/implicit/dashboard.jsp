<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

String user =
    (String)session.getAttribute("username");



if(user == null)
{
    response.sendRedirect("login.jsp");
}



Integer totalVisitors =
    (Integer)application.getAttribute("counter");

pageContext.setAttribute(
    "company",
    "OpenAI Technologies"
);

String company =
    (String)pageContext.getAttribute("company");

%>


<h1>Welcome <%= user %></h1>

<h3>Company:
<%= company %>
</h3>

<h3>Total Visitors:
<%= totalVisitors %>
</h3>

<a href="logout.jsp">Logout</a>



</body>
</html>