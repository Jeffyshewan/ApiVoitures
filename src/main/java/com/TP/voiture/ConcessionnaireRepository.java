package com.TP.voiture;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "concessionnaires")
public interface ConcessionnaireRepository extends JpaRepository<Concessionnaire, Integer> {
}
