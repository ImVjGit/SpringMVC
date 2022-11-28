<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome,${user.userName}</h1>
<h2>email: ${user.email}</h2>
<h4>pass:${user.userPassword}</h4>
<h2 style="color:green">${msg}</h2>
</body>
</html>