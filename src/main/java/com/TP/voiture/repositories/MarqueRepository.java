package com.TP.voiture.repositories;

import com.TP.voiture.models.Marque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "marque")
public interface MarqueRepository extends JpaRepository<Marque, Integer> {
}
