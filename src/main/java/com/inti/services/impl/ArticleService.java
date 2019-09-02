package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Article;
import com.inti.repositories.ArticleRepository;
import com.inti.services.interfaces.IArticleService;

@Service
public class ArticleService implements IArticleService {
	
	@Autowired
	ArticleRepository articleRepository;

	@Override
	public List<Article> findAll() {
		return articleRepository.findAll();
	}
	
	@Override
	public Article findById(int idArticle) {
		return articleRepository.findById(idArticle).orElse(null);
	}
	
	@Override
	public void save(Article article) {
		articleRepository.save(article);
	}

	@Override
	public void delete(int idArticle) {
		articleRepository.deleteById(idArticle);
	}
	
	@Override
	public List<Article> findByPrixGreaterThan(float prix) {
		return articleRepository.findByPrixGreaterThan(prix);
	}
	
	@Override
	public List<Article> findByStockLessThan(int stock) {
		return articleRepository.findByStockLessThan(stock);
	}
	
	@Override
	public List<Article> findByPrixAndStock(float prix, int stock) {
		return articleRepository.findByPrixAndStock(prix, stock);
	}
	
}
