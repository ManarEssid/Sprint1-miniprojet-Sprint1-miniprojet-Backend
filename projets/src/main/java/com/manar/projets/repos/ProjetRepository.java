package com.manar.projets.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.manar.projets.entities.Developeur;
import com.manar.projets.entities.Projet;

@RepositoryRestResource(path = "rest")
public interface ProjetRepository extends JpaRepository<Projet, Long> {
	List<Projet> findByNomProjet(String nom);
	List<Projet> findByNomProjetContains(String nom);
	@Query("select p from Projet p where p.nomProjet like %?1 and p.prixProjet >= ?2")
	List<Projet> findByNomPrix (String nom, Double prix);
	@Query("select p from Projet p where p.developeur = ?1")
	List<Projet> findByDevelopeur (Developeur dev );
	
	List<Projet> findByDevelopeurIdDevelopeur(Long id);
	
	List<Projet> findByOrderByNomProjetAsc();
	
	@Query("select p from Projet p order by p.nomProjet ASC, p.prixProjet DESC")
	List<Projet> trierProjetNomsPrix ();
}
