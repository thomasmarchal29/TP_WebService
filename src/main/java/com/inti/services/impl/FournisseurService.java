package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Fournisseur;
import com.inti.repositories.FournisseurRepository;
import com.inti.services.interfaces.IFournisseurService;

@Service
public class FournisseurService implements IFournisseurService {
	
	@Autowired
	FournisseurRepository fournisseurRepository;

	@Override
	public List<Fournisseur> findAll() {
		return fournisseurRepository.findAll();
	}
	
	@Override
	public Fournisseur findById(int idFournisseur) {
		return fournisseurRepository.findById(idFournisseur).orElse(null);
	}
	
	@Override
	public void save(Fournisseur fournisseur) {
		fournisseurRepository.save(fournisseur);
	}

	@Override
	public void delete(int idFournisseur) {
		fournisseurRepository.deleteById(idFournisseur);
	}
	
}
