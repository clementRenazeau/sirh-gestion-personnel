package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Collaborateur {
	private String matricule;
	private String nom;
	private String prenom;
	private LocalDate dateDeNaissance;
	private String adresse;
	private String numeroDeSecuriteSociale;
	private String emailPro;
	private String photo;
	private ZonedDateTime dateHeureCreation;
	private Departement departement;
	
	public Collaborateur(){
		
	}
	
	public Collaborateur(String matricule, String nom, String prenom, LocalDate dateDeNaissance, 
			String adresse, String numeroDeSecuriteSociale, String emailPro, String photo, ZonedDateTime dateHeureCreation){
		this.matricule=matricule;
		this.nom=nom;
		this.prenom=prenom;
		this.dateDeNaissance=dateDeNaissance;
		this.adresse=adresse;
		this.numeroDeSecuriteSociale=numeroDeSecuriteSociale;
		this.emailPro=emailPro;
		this.photo=photo;
		this.dateHeureCreation=dateHeureCreation;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getNumeroDeSecuriteSociale() {
		return numeroDeSecuriteSociale;
	}
	public void setNumeroDeSecuriteSociale(String numeroDeSecuriteSociale) {
		this.numeroDeSecuriteSociale = numeroDeSecuriteSociale;
	}
	public String getEmailPro() {
		return emailPro;
	}
	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public ZonedDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}
	public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	
}
