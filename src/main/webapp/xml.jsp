<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>XML Syntax JSP Example</title>
</head>
<body>

<h1>XML Syntax for JSP executed successfully</h1>

<!-- Declaration -->
<jsp:declaration>
String name = "Rishabh";

int div(int a, int b){
    return a / b;
}
</jsp:declaration>

<!-- Scriptlet -->
<jsp:scriptlet>
out.println("Hello : " + name );
</jsp:scriptlet>
<br>

<!-- Expression -->
Divide value is :
<jsp:expression>
div(100,10)
</jsp:expression>

</body>
</html>