<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Ma premi�re JSP</title>

</head>
	<body>
		<%	Date d = new Date();
			SimpleDateFormat formater = new SimpleDateFormat( "dd/MM/yyyy H:mm:ss" );
			String s = formater.format(d);
		%>
		
		Bonjour, nous sommes le <font color="blue"> <%= s %> </font>.
		<br />
		<a href="login.jsp"><button style="background-color:black; color:white">Log toi!</button></a>
	</body>
</html>