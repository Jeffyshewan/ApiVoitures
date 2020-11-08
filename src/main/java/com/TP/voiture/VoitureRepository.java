package com.TP.voiture;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "voitures")
public interface VoitureRepository extends JpaRepository<Voiture, Integer> {
}
