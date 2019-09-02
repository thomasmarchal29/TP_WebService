package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Fournisseur;

public interface IFournisseurService {

	public List<Fournisseur> findAll();
	public Fournisseur findById(int idFournisseur);
	public void save(Fournisseur fournisseur);
	public void delete(int idFournisseur);
	
}
