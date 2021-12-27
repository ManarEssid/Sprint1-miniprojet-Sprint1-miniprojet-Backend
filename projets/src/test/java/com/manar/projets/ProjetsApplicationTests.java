package com.manar.projets;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.manar.projets.entities.Developeur;
import com.manar.projets.entities.Projet;
import com.manar.projets.repos.ProjetRepository;


@SpringBootTest
class ProjetsApplicationTests {
	@Autowired
	ProjetRepository projetRepository;
	/*
	@Test
	public void testCreateProjet() {
	Projet proj = new Projet( 2L,"Association Amal",4000.500,"site pour l'association amal");
	projetRepository.save(proj);
	}
	
	@Test
	public void testFindProjet()
	{
	Projet proj = projetRepository.findById(1L).get();

	System.out.println(proj);
	}

	@Test
	public void testUpdateProjet()
	{
	Projet proj = projetRepository.findById(1L).get();
	proj.setPrixProjet(1500.00);
	projetRepository.save(proj);
	}
	
	

	
	@Test
	public void testDeleteProjet()
	{
	projetRepository.deleteById(1L);;
	}
	
	
	 
	@Test
	public void testListerTousProjets()
	{
	List<Projet> prods = projetRepository.findAll();
	for (Projet proj : prods)
	{
	System.out.println(proj);
	}
	
}

	
	@Test
	public void testFindByNomProjet()
	{
	List<Projet> proj = projetRepository.findByNomProjet("projetmed");

	for (Projet p : proj)
	{
	System.out.println(p);
	}

	}
	
	@Test
	public void testFindBynomProjetContains ()
	{
	List<Projet> proj=projetRepository.findByNomProjetContains("projetmed");

	for (Projet p : proj)
	{
	System.out.println(p);
	} }
	
	@Test
	public void testfindByNomPrix()
	{
	List<Projet> proj = projetRepository.findByNomPrix("Association Amal", 4000.5);
	for (Projet p : proj)
	{
	System.out.println(p);
	}

	}
	
	
	
	@Test
	public void testfindByDevelopeur()
	{
	Developeur dev = new Developeur();
	dev.setIdDevelopeur(1L);
	List<Projet> proj = projetRepository.findByDevelopeur(dev);
	for (Projet p : proj)
	{
	System.out.println(p);
	}
	}
	
	
	@Test
	public void findByDevelopeurIdDevelopeur()
	{
	List<Projet> proj = projetRepository.findByDevelopeurIdDevelopeur(1L);
	for (Projet p : proj)
	{
	System.out.println(p);
	}

	}
	
	@Test
	public void testfindByOrderByNomProjetAsc()
	{
	List<Projet> proj =

	projetRepository.findByOrderByNomProjetAsc();
	for (Projet p : proj)
	{
	System.out.println(p);
	}

	}
	*/
	
	
	@Test
	public void testtrierProjetNomsPrix()
	{
	List<Projet> proj = projetRepository.trierProjetNomsPrix();
	for (Projet p : proj)
	{
	System.out.println(p);
	}

	}
	
}