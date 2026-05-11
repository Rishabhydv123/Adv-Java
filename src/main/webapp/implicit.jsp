<head>
<meta charset="UTF-8">
<title>Implicit objects</title>
</head>

<body>

<%
/* request object */
String Name = request.getParameter("username");

/* response object */
response.setContentType("text/html");

/* session object */
session.setAttribute("usersession", Name);

/* page context object */
pageContext.setAttribute("message", "hello this is java developer");

/* out object */
out.println("<h1>Username: " + Name + "</h1>");

out.println("<h1> session : " + session.getAttribute("usersession") + "</h1>");

out.println("<h2>page context : " + pageContext.getAttribute("message") + "</h2>");
%>

</body>
</html>