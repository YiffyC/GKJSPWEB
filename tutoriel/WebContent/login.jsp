<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ include file="header.html" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>
</head>
<body>

	<form action="/ServletLogin">
	
		<table>
			<tr> <td>Login</td> <td><input type = "text" name="login"></td></tr>
			<tr> <td>Mot de passe</td> <td><input type="password" name="mdp"></td></tr>
		</table>
	
	<input type="submit">
	</form>

</body>
<%@ include file="footer.html" %>


</html>