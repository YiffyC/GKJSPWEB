<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>page de resulatat avec beans</title>
</head>
<body>
	<p>nom : <jsp:getProperty property="nom" name="bean" /> </p>
	<p>prenom : <jsp:getProperty property="prenom" name="bean" /> </p>
	<p>mail : <jsp:getProperty property="mail" name="bean" /> </p>
	<p>login : <jsp:getProperty property="login" name="bean" /> </p>
	<p>mdp : <jsp:getProperty property="mdp" name="bean" /> </p>
</body>
</html>