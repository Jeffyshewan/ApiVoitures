package com.TP.voiture.controllers;

import com.TP.voiture.models.Marque;
import com.TP.voiture.repositories.MarqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/marques")
public class MarqueController {

    @Autowired
    private MarqueRepository marqueRepository;

    @GetMapping
    public Iterable<Marque> getMarques() {
        return marqueRepository.findAll();
    }

    @GetMapping("/{marqueId}")
    public Optional<Marque> getMarque(@PathVariable("marqueId") int marqueId) {
        return marqueRepository.findById(marqueId);
    }

    @DeleteMapping("/delete/{marqueId}")
    public void deleteMarque(@PathVariable("marqueId") int marqueId) {
        marqueRepository.deleteById(marqueId);
    }
}
