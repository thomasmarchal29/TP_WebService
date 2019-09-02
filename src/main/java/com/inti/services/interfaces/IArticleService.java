package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Article;

public interface IArticleService {

	public List<Article> findAll();
	public Article findById(int idArticle);
	public void save(Article article);
	public void delete(int idArticle);
	
	public List<Article> findByPrixGreaterThan(float prix);
	public List<Article> findByStockLessThan(int stock);
	public List<Article> findByPrixAndStock(float prix, int stock);
	
}
