package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inti.entities.Achat;

@Repository
public interface AchatRepository extends JpaRepository<Achat,Integer> {
	@Query("from Achat ac WHERE ac.fournisseur.idFournisseur = :idFournisseur")
	public List<Achat> findByFournisseur(@Param("idFournisseur") int idFournisseur);
	
	@Query("from Achat ac WHERE ac.article.idArticle = :idArticle")
	public List<Achat> findByArticle(@Param("idArticle") int idArticle);
}
