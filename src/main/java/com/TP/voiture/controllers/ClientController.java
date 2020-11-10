package com.TP.voiture.controllers;

import com.TP.voiture.models.Client;
import com.TP.voiture.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/clients")
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;

    @GetMapping
    public Iterable<Client> getClients() {
        return clientRepository.findAll();
    }

    @GetMapping("/{clientId}")
    public Optional<Client> getClient(@PathVariable("clientId") int clientId) {
        return clientRepository.findById(clientId);
    }
}
