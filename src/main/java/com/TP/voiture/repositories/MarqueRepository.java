package com.TP.voiture.repositories;

import com.TP.voiture.classes.Marque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "marques")
public interface MarqueRepository extends JpaRepository<Marque, Integer> {
}
