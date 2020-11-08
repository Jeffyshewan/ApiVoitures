package com.TP.voiture.repositories;

import com.TP.voiture.classes.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "clients")
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
