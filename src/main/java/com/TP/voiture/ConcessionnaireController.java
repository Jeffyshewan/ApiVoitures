package com.TP.voiture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/concessionnaires")
public class ConcessionnaireController {
    @Autowired
    private ConcessionnaireRepository concessionnaireRepository;

    @GetMapping
    public Iterable<Concessionnaire> getConcessionnaires() {
        return concessionnaireRepository.findAll();
    }

    @GetMapping("/{concessionnairesId}")
    public Optional<Concessionnaire> getConcessionnaire(@PathVariable("concessionnaireId") int concessionnaireId) {
        return concessionnaireRepository.findById(concessionnaireId);
    }
}
