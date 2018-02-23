<%@page import="servlet.MonServlet"%>
<%@page import="beans.InformationBean"%>
<%@page import="com.formation.tools.DateUtil"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>identification</title>
</head>
<%@ include file="header.html" %>

		<%
			InformationBean bean = (InformationBean)session.getAttribute("bean");
		
		%>

<body>


	<jsp:useBean id="dateBean" class="com.formation.tools.DateUtil"></jsp:useBean>
	<jsp:getProperty property="date" name="dateBean"/>
	
	
	<p>Bonjour <font color="FF00FF"><%= bean.getLogin() %></font></p> 
	<form name="identificationForm" method="post" action="MonServlet3">
		<table name="Formulaire">
		<tr>
			<td><b>Nom : </b></td>		<td><input type = "text" name="nom"  ></td>
		</tr>
	
		<tr>
			<td><b>Prenom :</b></td>	<td><input type = "text" name="prenom"></td>
		</tr>

		<tr>
			<td><b>Email :</b></td> 	<td><input type = "email" name="mail"></td>
		</tr>
	
		<tr>
			<td><b>Login :</b></td>		<td><input type = "text"  readonly="readonly" name="login" value="<%= bean.getLogin() %>"></td>
		</tr>
	
		<tr>
			<td><b>Mdp :</b></td>		<td><input type="password" name="mdp" readonly="readonly" value="<%= bean.getMdp() %>"></td>
		</tr>
	
		</table>
	<input type="reset" value="raz">
	<input type="submit" value=":)" >
	</form>
</body>
	<%@ include file="footer.html" %>
</html>