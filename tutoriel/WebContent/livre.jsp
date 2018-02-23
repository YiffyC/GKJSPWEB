<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Infos sur l'auteur</p>
	<form action="/ServletLivre">
		<p>nom: <input type="text" name="nom" readonly="readonly" value="<jsp:getProperty property="nom" name="auteur" />" ></p>
		<p>mail: <input type="mail" name="mail" readonly="readonly" value="<jsp:getProperty property="mail" name="auteur" />"></p>
		
		
		<p>Renseignez le livre</p>
		
		<p>titre :<input type="text" name="titre"></p>
		<p>prix :<input type="number" name="prix"></p>
		<p>reference :<input type="text" name="ref"></p>
		
		<input type="submit">
	</form>
</body>
</html>