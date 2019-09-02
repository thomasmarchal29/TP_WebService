package com.inti.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Fournisseur {
	
	private int idFournisseur;
	private String nomFournisseur;
	private String adresse;
	private String ville;
	
	public Fournisseur() {
		super();
	}
	
	public Fournisseur(String nomFournisseur, String adresse, String ville) {
		super();
		this.nomFournisseur = nomFournisseur;
		this.adresse = adresse;
		this.ville = ville;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdFournisseur() {
		return idFournisseur;
	}
	
	public void setIdFournisseur(int idFournisseur) {
		this.idFournisseur = idFournisseur;
	}
	
	@Column
	public String getNomFournisseur() {
		return nomFournisseur;
	}
	
	public void setNomFournisseur(String nomFournisseur) {
		this.nomFournisseur = nomFournisseur;
	}
	
	@Column
	public String getAdresse() {
		return adresse;
	}
	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	@Column
	public String getVille() {
		return ville;
	}
	
	public void setVille(String ville) {
		this.ville = ville;
	}

	@OneToMany(mappedBy = "fournisseur")
	private List<Achat> listeAchat = new ArrayList<Achat>();
	
}
