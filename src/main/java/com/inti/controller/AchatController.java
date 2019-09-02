package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Achat;
import com.inti.services.interfaces.IAchatService;

@RestController
public class AchatController {

	@Autowired
	IAchatService achatService;
	
	@RequestMapping(value="/achats", method = RequestMethod.GET)
	public List<Achat> findAll() {
		return achatService.findAll();
	}
	
	@RequestMapping(value="/achats/{id}", method = RequestMethod.GET)
	public Achat findById(@PathVariable ("id") int idAchat) {
		return achatService.findById(idAchat);
	}
	
	@RequestMapping(value="/achats", method = RequestMethod.POST)
	public void save(@RequestBody Achat achat) {
		achatService.save(achat);
	}
	
	@RequestMapping(value="/achats/{id}", method = RequestMethod.PUT)
	public void update(@PathVariable("id") int idAchat, @RequestBody Achat achat) {
		Achat currentAchat = achatService.findById(idAchat);
		currentAchat.setPrixAchat(achat.getPrixAchat());
		currentAchat.setDelai(achat.getDelai());
		achatService.save(currentAchat);
	}
	
	@RequestMapping(value="/achats/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") int idAchat) {
		achatService.delete(idAchat);
	}
	
	@RequestMapping(value="/achatsParFo/{id}", method = RequestMethod.GET)
	public List<Achat> findByFournisseur(@PathVariable("id") int idFournisseur) {
		return achatService.findByFournisseur(idFournisseur);
	}
	
	@RequestMapping(value="/achatsParAr/{id}", method = RequestMethod.GET)
	public List<Achat> findByArticle(@PathVariable("id") int idArticle) {
		return achatService.findByArticle(idArticle);
	}
	
// Commentaire Ben
	
}
