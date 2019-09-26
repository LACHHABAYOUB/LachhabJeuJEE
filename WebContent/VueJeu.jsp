<%@page import="web.JeuModel"%>
<%
	JeuModel mod=(JeuModel)request.getAttribute("mod");

%>
<!DOCTYPE html>
 <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Jeu</title>
</head>
<body>
<form action="controleur.php" method="POST">
	<div><h2> le serveur choisit un nombre entre 0 et 100 :</h2></div>
	<div>
	<table>
	<tr>
	<td>Deviner ce nombre :</td>
	<td><input type="text" name="secret" value="<%= mod.getSecret()%>"/></td>
	<td><input type="submit" value="essai" /></td>
	<td><input type="submit" value="rejouer"/></td>
	</tr>
	</table>
	
	</div>
	
	<div>
	<table>
	<tr>
	<td> resultat:  </td>
	<td><%= mod.getTrouve() %></td>
	<td></td>
	</tr>
	</table>
	
	</div>
</form>
</body>
</html>