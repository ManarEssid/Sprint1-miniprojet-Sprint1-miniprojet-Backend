package com.manar.projets.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomProjet", types = { Projet.class })
public interface ProjetProjection {
	public String getNomProjet();

}
