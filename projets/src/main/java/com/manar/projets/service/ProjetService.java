package com.manar.projets.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.manar.projets.entities.Developeur;
import com.manar.projets.entities.Projet;

public interface ProjetService {
	Projet saveProjet(Projet proj);
	Projet updateProjet(Projet proj);
	void deleteProjet(Projet proj);
	void deleteProjetById(Long id);
	Projet getProjet(Long id);
	List<Projet> getAllProjets();
	List<Projet> findByNomProjet(String nom);
	List<Projet> findByNomProjetContains(String nom);
	List<Projet> findByNomPrix (String nom, Double prix);
	
	List<Projet> findByDevelopeur (Developeur dev );
	
	List<Projet> findByDevelopeurIdDevelopeur(Long id);
	
	List<Projet> findByOrderByNomProjetAsc();
	

	List<Projet> trierProjetNomsPrix ();
}
