package com.TP.voiture.controllers;

import com.TP.voiture.models.Voiture;
import com.TP.voiture.repositories.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/voitures")
public class VoitureController {

    @Autowired
    private VoitureRepository voitureRepository;

    @GetMapping
    public Iterable<Voiture> getVoitures() {
        return voitureRepository.findAll();
    }

    @GetMapping("/{voitureId}")
    public Optional<Voiture> getVoiture(@PathVariable("voitureId") int voitureId) {
        return voitureRepository.findById(voitureId);
    }

    @DeleteMapping("/delete/{voitureId}")
    public void deleteVoiture(@PathVariable("voitureId") int voitureId) {
        voitureRepository.deleteById(voitureId);
    }
}
