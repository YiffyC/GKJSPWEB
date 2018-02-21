<%@page import="beans.InformationBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Chargement page : ok</p>
	
	<%
		InformationBean bean = (InformationBean)session.getAttribute("bean");
		out.println(bean.getNom());
		out.println(bean.getPrenom());
		out.println(bean.getMail());
		out.println(bean.getMdp());
		out.println(bean.getLogin());
	%>

</body>
</html>