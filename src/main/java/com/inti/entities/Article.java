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
public class Article {

	private int idArticle;
	private String libelle;
	private int stock;
	private float prix;
	
	public Article() {
		super();
	}

	public Article(String libelle, int stock, float prix) {
		super();
		this.libelle = libelle;
		this.stock = stock;
		this.prix = prix;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}

	@Column
	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Column
	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Column
	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}
	
	@OneToMany(mappedBy = "article")
	private List<Achat> listeAchat = new ArrayList<Achat>();
	
}
