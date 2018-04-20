package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

/**
 * Servlet implementation class AjouterCollaborateur
 */
public class AjouterCollaborateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterCollaborateur() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/view/collab/ajouterCollaborateur.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String matricule = ""+nom+prenom;
		LocalDate locd = LocalDate.parse(request.getParameter("dateNaissance"), 
				DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		String adresse = request.getParameter("adresse");
		String numSec = request.getParameter("secuNumber");
		String email = ""+nom+"."+prenom+"@"+"societe.com";
		String photo =  "photo";
		ZonedDateTime dateCrea = LocalDateTime.now().atZone(ZoneId.of("Europe/Paris"));
		Collaborateur col = new Collaborateur(matricule, nom, prenom, locd, adresse, numSec, email, photo, dateCrea);
		collabService.sauvegarderCollaborateur(col);
		request.setAttribute("collaborateurs", collabService.listerCollaborateurs());
		request.getRequestDispatcher("/view/collab/listerCollaborateurs.jsp").forward(request, response);
	}

}
