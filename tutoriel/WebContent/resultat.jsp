<%@page import="beans.InformationBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ include file="header.html" %>
<body>
	<p>Identification reussie</p>
	
	<%
		InformationBean bean = (InformationBean)session.getAttribute("bean");
	%>
	<p>Nom : <%out.println(bean.getNom()); %></p>
	<p>Prenom : <%out.println(bean.getPrenom()); %></p>
	<p>Login : <%out.println(bean.getLogin()); %></p>
	<p>Mot de passe : <%out.println(bean.getMdp()); %></p>
</body>
<%@ include file="footer.html" %>
</html>