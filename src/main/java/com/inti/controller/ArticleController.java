package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Article;
import com.inti.services.interfaces.IArticleService;

@RestController
public class ArticleController {

	@Autowired
	IArticleService articleService;
	
	@RequestMapping(value="/articles", method = RequestMethod.GET)
	public List<Article> findAll() {
		return articleService.findAll();
	}
	
	@RequestMapping(value="/articles/{id}", method = RequestMethod.GET)
	public Article findById(@PathVariable ("id") int idArticle) {
		return articleService.findById(idArticle);
	}
	
	@RequestMapping(value="/articles", method = RequestMethod.POST)
	public void save(@RequestBody Article article) {
		articleService.save(article);
	}
	
	@RequestMapping(value="/articles/{id}", method = RequestMethod.PUT)
	public void update(@PathVariable("id") int idArticle, @RequestBody Article article) {
		Article currentArticle = articleService.findById(idArticle);
		currentArticle.setLibelle(article.getLibelle());
		currentArticle.setStock(article.getStock());
		currentArticle.setPrix(article.getPrix());
		articleService.save(currentArticle);
	}
	
	@RequestMapping(value="/articles/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") int idArticle) {
		articleService.delete(idArticle);
	}
	
	@RequestMapping(value="/articlesParPrix/{prix}", method = RequestMethod.GET)
	public List<Article> findByPrixGreaterThan(@PathVariable ("prix") float prix) {
		return articleService.findByPrixGreaterThan(prix);
	}
	
	@RequestMapping(value="/articlesParStock/{stock}", method = RequestMethod.GET)
	public List<Article> findByStockLessThan(@PathVariable ("stock") int stock) {
		return articleService.findByStockLessThan(stock);
	}
	
	
	@RequestMapping(value="/articlesParPrixEtStock/{prix}/{stock}", method = RequestMethod.GET)
	public List<Article> findByPrixAndStock(@PathVariable ("prix") float prix, @PathVariable ("stock") int stock) {
		return articleService.findByPrixAndStock(prix, stock);
	}
	
	//Fernando bois de l'eau
	
}
