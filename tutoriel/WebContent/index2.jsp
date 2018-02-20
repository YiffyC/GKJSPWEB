<%@page import="com.formation.tools.DateUtil"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Ma première JSP</title>

</head>
	<body>
		Bonjour, nous sommes le <font color="blue"> <%= DateUtil.returnDatelocale(new Date()) %> </font> et vous êtes formés par Sylvain LALLIER 
	</body>
</html>