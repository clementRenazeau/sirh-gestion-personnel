<%@page import="java.util.List"%>
<%@page import="dev.sgp.entite.Collaborateur"%>
<%@page import="dev.sgp.util.Constantes"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SGP - App</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/bootstrap.css">
</head>
<body>
	<div class="container">
		<h1>Les collaborateurs</h1>
		<div class="ml-2 card" style="width: 24rem">
			<%
				for (int i = 0; i < Constantes.COLLAB_SERVICE.listerCollaborateurs().size(); i++) {
					Collaborateur collab = Constantes.COLLAB_SERVICE.listerCollaborateurs().get(i);
			%>
			<h5 class="card-header"><%=collab.getNom()%><%=collab.getPrenom()%></h5>
			<div class="card-body form-group row">

				<img src="<%=collab.getPhoto()%>" alt="Photo" class="col">
				<div class="col">
					<p class="card-text">
						Date de naissance :
						<%=collab.getDateDeNaissance()%></p>
					<p class="card-text">
						Adresse :
						<%=collab.getAdresse()%></p>
					<p class="card-text">
						Email :
						<%=collab.getEmailPro()%></p>
					<p class="card-text">
						Numéro de sécurité sociale :
						<%=collab.getNumeroDeSecuriteSociale()%></p>
				</div>
			</div>
			<div class="w-100"></div>
			<div align="right" class="mr-2">
				<a
					href="<%=request.getContextPath()%>/views/collab/editCollaborateur.jsp"
					class="btn btn-primary">Éditer</a>
			</div>

			<%
				}
			%>
		</div>
		<a href="<%=request.getContextPath()%>/collaborateurs/ajouter">Ajout
			d'un nouveau collaborateur</a>
	</div>
</body>
</html>