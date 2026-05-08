<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Today's Date and Time:</h3>
<%= new java.util.Date() %>
<br>

<%
    int marks = 75; 
    if(marks >= 50){
%>

<h2>Result: Pass</h2>

<%
    } else {
%>

<h2>Result: Fail</h2>

<%
    }
%>

<br>
<%
for(int i=1; i<=5; i++){
%>

<h3>Number: <%= i %></h3>

<%
}
%>
</body>
</html>