package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Fournisseur;

@Repository
public interface FournisseurRepository extends JpaRepository<Fournisseur,Integer> {

}
