package com.manar.projets.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Developeur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDevelopeur;
	private String nomDevelopeur;
	private String post ;
	private Double salaire;
	
	@JsonIgnore
	@OneToMany(mappedBy = "developeur")
	private List<Projet> projets;
	
}
