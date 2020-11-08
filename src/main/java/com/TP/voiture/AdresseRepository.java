package com.TP.voiture;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "adresses")
public interface AdresseRepository extends JpaRepository<Adresse, Integer> {
}
