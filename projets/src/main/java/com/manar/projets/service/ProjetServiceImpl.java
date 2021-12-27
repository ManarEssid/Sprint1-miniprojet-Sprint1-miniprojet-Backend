package com.manar.projets.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manar.projets.entities.Developeur;
import com.manar.projets.entities.Projet;
import com.manar.projets.repos.ProjetRepository;

@Service
public class ProjetServiceImpl implements ProjetService {
	@Autowired
	
	ProjetRepository projetRepository;
	
	@Override
	
	public Projet saveProjet(Projet proj) {
	return projetRepository.save(proj);
	}
	@Override
	public Projet updateProjet(Projet proj) {
	return projetRepository.save(proj);
	}
	
	@Override
	
	public void deleteProjet(Projet proj) {
	projetRepository.delete(proj);
	}
	@Override
	public void deleteProjetById(Long id) {
	projetRepository.deleteById(id);
	}
	@Override
	public Projet getProjet(Long id) {
	return projetRepository.findById(id).get();
	}
	@Override
	public List<Projet> getAllProjets() {
	return projetRepository.findAll();
	}
	@Override
	public List<Projet> findByNomProjet(String nom) {
		return projetRepository.findByNomProjet(nom);
	}
	@Override
	public List<Projet> findByNomProjetContains(String nom) {
		
		return projetRepository.findByNomProjetContains(nom);
	}
	@Override
	public List<Projet> findByNomPrix(String nom, Double prix) {
		
		return projetRepository.findByNomPrix(nom, prix);
	}
	@Override
	public List<Projet> findByDevelopeur(Developeur dev) {
		
		return projetRepository.findByDevelopeur(dev);
	}
	@Override
	public List<Projet> findByDevelopeurIdDevelopeur(Long id) {

		return projetRepository.findByDevelopeurIdDevelopeur(id);
	}
	@Override
	public List<Projet> findByOrderByNomProjetAsc() {
		
		return projetRepository.findByOrderByNomProjetAsc();
	}
	@Override
	public List<Projet> trierProjetNomsPrix() {
		
		return projetRepository.trierProjetNomsPrix();
	}
	}


