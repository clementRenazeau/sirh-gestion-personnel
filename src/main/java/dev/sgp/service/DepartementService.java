package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.Departement;

public class DepartementService {
	private List<Departement> listeDepartements;
	
	public DepartementService(){
		listeDepartements = new ArrayList<>();
		listeDepartements.add(new Departement(1, "Administratif", true));
		listeDepartements.add(new Departement(2, "Comptabilité", true));
		listeDepartements.add(new Departement(3, "Informatique", true));
		listeDepartements.add(new Departement(4, "Ressources Humaines", true));
	}
	
	public List<Departement> listerDepartements() {
		return listeDepartements;
	}

	public void sauvegarderDepartement(Departement dep) {
		listeDepartements.add(dep);
	}
}
