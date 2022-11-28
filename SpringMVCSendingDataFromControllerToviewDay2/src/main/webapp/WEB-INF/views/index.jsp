<%@page import="java.util.List"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>New Index page</h1>


	<%
// 	String name = (String) request.getAttribute("name");
// 	Integer id = (Integer) request.getAttribute("idu");

	%>
	<h6>
		Id :
<%-- 		<%=id%> --%>
${idu}
		</h6>
	<h1>
		Welcome,${name}
<%-- 		<%=name%> --%>
		</h1>
		
	<h2>List Friend</h2>
	
	<c:forEach var="item" items="${f}">
	<h3>${item}</h3>
	</c:forEach>
	
	
		


	


</body>
</html>