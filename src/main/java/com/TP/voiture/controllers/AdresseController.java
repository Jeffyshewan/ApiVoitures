package com.TP.voiture.controllers;

import com.TP.voiture.classes.Adresse;
import com.TP.voiture.repositories.AdresseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/adresses")
public class AdresseController {

    @Autowired
    private AdresseRepository adresseRepository;

    @GetMapping
    public Iterable<Adresse> getAdresses() {
        return adresseRepository.findAll();
    }

    @GetMapping("/{adresseId]")
    public Optional<Adresse> getAdresse(@PathVariable("adresseId") int adresseId) {
        return adresseRepository.findById(adresseId);
    }
}
