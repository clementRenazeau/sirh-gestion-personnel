package dev.sgp.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditerCollaborateurController
 */
public class EditerCollaborateursController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditerCollaborateursController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String matricule = request.getParameter("matricule");
		if(matricule==null){
			response.sendError(400, "Un matricule est attendu");
		}
		else{
			//"<h1>Edition de collaborateur</h1>" + "<ul>" + "<li> CORE + "</li>" + "</ul>"
			response.getWriter().write("Matricule : " + matricule );
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String matricule = request.getParameter("matricule");
		String titre= request.getParameter("titre");
		String nom= request.getParameter("nom");
		String prenom= request.getParameter("prenom");
		String listMiss="";
		if(matricule==null){
			listMiss += "matricule";
		}
		if(titre==null){
			listMiss += "titre";
		}
		if(nom==null){
			listMiss += "nom";
		}
		if(prenom==null){
			listMiss += "prenom";
		}
		if(matricule==null||titre==null||nom==null||prenom==null){
			response.sendError(400, "Les parametres : "+ listMiss + "sont attendus");
		}
		else{
			//"<h1>Edition de collaborateur</h1>" + "<ul>" + "<li> CORE + "</li>" + "</ul>"
			response.setStatus(201);
			response.getWriter().write("Creation d'un collaborateur avec les informations suivantes :" 
			+ "\nmatricule=" + matricule 
			+ ",titre=" + titre  
			+ ",nom=" + nom  
			+ ",prenom=" + prenom);
		}
	}

}
