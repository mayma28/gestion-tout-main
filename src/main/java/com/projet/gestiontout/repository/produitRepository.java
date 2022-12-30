package com.projet.gestiontout.repository;

import java.util.List;

import com.projet.gestiontout.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;


public interface produitRepository extends JpaRepository<Produit, Long> {
    List<Produit> findByPublished(boolean published);
    List<Produit> findByTitleContaining(String title);

}