package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Achat;
import com.inti.repositories.AchatRepository;
import com.inti.services.interfaces.IAchatService;

@Service
public class AchatService implements IAchatService {
	
	@Autowired
	AchatRepository achatRepository;

	@Override
	public List<Achat> findAll() {
		return achatRepository.findAll();
	}
	
	@Override
	public Achat findById(int idAchat) {
		return achatRepository.findById(idAchat).orElse(null);
	}
	
	@Override
	public void save(Achat achat) {
		achatRepository.save(achat);
	}

	@Override
	public void delete(int idAchat) {
		achatRepository.deleteById(idAchat);
	}
	
	@Override
	public List<Achat> findByFournisseur(int idFournisseur) {
		return achatRepository.findByFournisseur(idFournisseur);
	}
	
	@Override
	public List<Achat> findByArticle(int idArticle) {
		return achatRepository.findByArticle(idArticle);
	}
	
}
