package com.manar.projets.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.manar.projets.entities.Projet;
import com.manar.projets.service.ProjetService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProjetRESTController {
	
	@Autowired
	ProjetService projetService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Projet> getAllProjet() {
	return projetService.getAllProjets();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Projet getProjetById(@PathVariable("id") Long id) {
	return projetService.getProjet(id);

	}	
	
	@RequestMapping(method = RequestMethod.POST)
	public Projet createProjet(@RequestBody Projet projet) {
	return projetService.saveProjet(projet);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Projet updateProjet(@RequestBody Projet projet) {
	return projetService.updateProjet(projet);
	}
	
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteProjet(@PathVariable("id") Long id)
	{
	projetService.deleteProjetById(id);
	}
	
	@RequestMapping(value="/projdev/{idDev}",method = RequestMethod.GET)
	public List<Projet> getProjetsByDevId(@PathVariable("idDev") Long idDev) {
	return projetService.findByDevelopeurIdDevelopeur(idDev);
	}
	@RequestMapping(path = "all",method = RequestMethod.GET)
	public List<Projet> getAllProjets() {
	return projetService.getAllProjets();
	}
	
	
}
