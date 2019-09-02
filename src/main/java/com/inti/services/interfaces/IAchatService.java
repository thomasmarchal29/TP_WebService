package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Achat;

public interface IAchatService {

	public List<Achat> findAll();
	public Achat findById(int idAchat);
	public void save(Achat achat);
	public void delete(int idAchat);
	
	public List<Achat> findByFournisseur(int idFournisseur);
	public List<Achat> findByArticle(int idArticle);
	
}
