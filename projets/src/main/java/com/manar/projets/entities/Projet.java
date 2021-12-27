package com.manar.projets.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Projet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProjet;
	private String nomProjet;
	private Double prixProjet;
	private String description;
	
	@ManyToOne
	private Developeur developeur;
	
	
	
	public Projet() {
		super();
		
	}



	public Projet(Long idProjet, String nomProjet, Double prixProjet, String description) {
		super();
		this.idProjet = idProjet;
		this.nomProjet = nomProjet;
		this.prixProjet = prixProjet;
		this.description = description;
	}



	public Long getIdProjet() {
		return idProjet;
	}



	public void setIdProjet(Long idProjet) {
		this.idProjet = idProjet;
	}



	public String getNomProjet() {
		return nomProjet;
	}



	public void setNomProjet(String nomProjet) {
		this.nomProjet = nomProjet;
	}



	public Double getPrixProjet() {
		return prixProjet;
	}



	public void setPrixProjet(Double prixProjet) {
		this.prixProjet = prixProjet;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	@Override
	public String toString() {
		return "Projet [idProjet=" + idProjet + ", nomProjet=" + nomProjet + ", prixProjet=" + prixProjet
				+ ", description=" + description + "]";
	}
	
	
	
	
	
}
