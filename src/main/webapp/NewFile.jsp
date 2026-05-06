<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>

<h1 style="color:blue">wellocome</h1>

<%=
"Hello java user"
/* expression Tag */


%>
<br>
<%

int a = 10;
int b = 20;

// Arithmetic operations
int add = a + b;
int sub = a - b;
int mul = a * b;
int div = a / b;
int mod = a % b;

out.println("Addition: " + add + "<br>");
out.println("Subtraction: " + sub + "<br>");
out.println("Multiplication: " + mul + "<br>");
out.println("Division: " + div + "<br>");
out.println("Modulus: " + mod + "<br>");
%>

<%-- <%!
// Methods (Declaration tag)
int add(int a, int b){
    return a + b;
}

int sub(int a, int b){
    return a - b;
}

int mul(int a, int b){
    return a * b;
}

int div(int a, int b){
    return a / b;
}

int mod(int a, int b){
    return a % b;
}
%> --%>

<br>

<%-- <%
out.println("Using Methods:<br>");
out.println("Addition: " + add(10, 4) + "<br>");
out.println("Subtraction: " + sub(10, 4) + "<br>");
out.println("Multiplication: " + mul(10, 4) + "<br>");
out.println("Division: " + div(10, 4) + "<br>");
out.println("Modulus: " + mod(10, 4) + "<br>");
%> --%>
</body>
</html>