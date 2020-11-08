package com.TP.voiture.classes;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Voiture {
    @Id
    private int id;
    private String name;
    private String marque;
    private Integer numeroDeSerie;
    private Date dateImmatriculation;
    private String couleur;
    private Integer nombrePortes;
    private String categorie;
    @OneToMany
    @JoinColumn(name = "voiture_id")
    private Set<Voiture> voitures;
}
