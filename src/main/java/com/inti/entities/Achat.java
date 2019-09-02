package com.inti.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Achat {

	private int idAchat;
	private float prixAchat;
	private int delai;
	
	private Article article;
	private Fournisseur fournisseur;
	
	public Achat() {
		super();
	}

	public Achat(float prixAchat, int delai) {
		super();
		this.prixAchat = prixAchat;
		this.delai = delai;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdAchat() {
		return idAchat;
	}

	public void setIdAchat(int idAchat) {
		this.idAchat = idAchat;
	}

	@Column
	public float getPrixAchat() {
		return prixAchat;
	}

	public void setPrixAchat(float prixAchat) {
		this.prixAchat = prixAchat;
	}

	@Column
	public int getDelai() {
		return delai;
	}

	public void setDelai(int delai) {
		this.delai = delai;
	}

	@ManyToOne
	@JoinColumn(name = "idArticle")
	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	@ManyToOne
	@JoinColumn(name = "idFournisseur")
	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}
	
}
