<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



<%

String user = request.getParameter("username");
String pass = request.getParameter("password");

if(user.equals("admin") && pass.equals("1234"))
{

    session.setAttribute("username", user);


    Integer counter =
        (Integer)application.getAttribute("counter");

    if(counter == null)
    {
        counter = 0;
    }

    counter++;

    application.setAttribute("counter", counter);


    response.sendRedirect("dashboard.jsp");

}
else
{

    out.println("<h2>Invalid Credentials</h2>");

}

%>

</body>
</html>