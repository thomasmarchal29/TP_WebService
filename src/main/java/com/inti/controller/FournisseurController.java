package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Fournisseur;
import com.inti.services.interfaces.IFournisseurService;

@RestController
public class FournisseurController {

	@Autowired
	IFournisseurService fournisseurService;
	
	@RequestMapping(value="/fournisseurs", method = RequestMethod.GET)
	public List<Fournisseur> findAll() {
		return fournisseurService.findAll();
	}
	
	@RequestMapping(value="/fournisseurs/{id}", method = RequestMethod.GET)
	public Fournisseur findById(@PathVariable ("id") int idFournisseur) {
		return fournisseurService.findById(idFournisseur);
	}
	
	@RequestMapping(value="/fournisseurs", method = RequestMethod.POST)
	public void save(@RequestBody Fournisseur fournisseur) {
		fournisseurService.save(fournisseur);
	}
	
	@RequestMapping(value="/fournisseurs/{id}", method = RequestMethod.PUT)
	public void update(@PathVariable("id") int idFournisseur, @RequestBody Fournisseur fournisseur) {
		Fournisseur currentFournisseur = fournisseurService.findById(idFournisseur);
		currentFournisseur.setNomFournisseur(fournisseur.getNomFournisseur());
		currentFournisseur.setAdresse(fournisseur.getAdresse());
		currentFournisseur.setVille(fournisseur.getVille());
		fournisseurService.save(currentFournisseur);
	}
	
	@RequestMapping(value="/fournisseurs/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") int idFournisseur) {
		fournisseurService.delete(idFournisseur);
	}
	
}
