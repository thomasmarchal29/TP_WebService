package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inti.entities.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article,Integer> {

	List<Article> findByPrixGreaterThan(float prix);

	List<Article> findByStockLessThan(int stock);
	
	@Query("from Article WHERE prix > :prix AND stock < :stock")
	public List<Article> findByPrixAndStock(@Param("prix") float prix, @Param("stock") int stock);

}
