<%@page import="java.time.LocalDateTime"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help</title>
</head>
<body>
	<h1>Help Page</h1>

<% 
// 	String name = (String) request.getAttribute("name");
// 	Integer rollnumber = (Integer) request.getAttribute("rollnumber");
// 	LocalDateTime t=(LocalDateTime)request.getAttribute("time");
	%>
	<h6>
		Id :
<%-- 		<%=rollnumber%> --%>
		${rollnumber}
		</h6>
	<h1>${name}
<%-- 	<%=name%> --%>
	</h1>
	<h3>
<%-- 	<%=t.toString() %> --%>
${time}
	</h3>



</body>
</html>