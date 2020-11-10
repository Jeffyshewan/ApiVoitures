package com.TP.voiture.repositories;

import com.TP.voiture.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "client")
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
