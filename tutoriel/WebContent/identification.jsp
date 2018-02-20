<%@page import="servlet.MonServlet"%>
<%@page import="com.formation.tools.DateUtil"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>identification</title>
</head>

<body>

	<p>Bonjour, nous sommes le <font color="FF00FF"><i><%= DateUtil.returnDatelocale(new Date()) %> <i></i></i></font></p> 
	<form name="identificationForm" method="post" action="MonServlet">
		<table name="Formulaire">
		<tr>
			<td><b>Nom : </b></td>		<td><input type = "text" name="nom"></td>
		</tr>
	
		<tr>
			<td><b>Prenom :</b></td>	<td><input type = "text" name="prenom"></td>
		</tr>

		<tr>
			<td><b>Email :</b></td> 	<td><input type = "email" name="mail"></td>
		</tr>
	
		<tr>
			<td><b>Login :</b></td>		<td><input type = "text" name="login"></td>
		</tr>
	
		<tr>
			<td><b>Mdp :</b></td>		<td><input type="password" name="mdp"></td>
		</tr>
	
		</table>
	<input type="reset" value="raz">
	<input type="submit" value=":)" >
	</form>
</body>

</html>