<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome STRUTS 2</h1>

	<ul>
		<li>
		   <s:a action="clientes">Clietes</s:a>
		</li>
		<li>
		   <s:a action="usuarios">Usuarios</s:a>
		</li>
		<li>
		   <s:a action="registro">Registro</s:a>
		</li>
	</ul>

</body>
</html>