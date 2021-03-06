package com.TP.voiture.models;

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
    private int numero_de_serie;
    private Date date_immatriculation;
    private String couleur;
    private int nombre_portes;
    private String categorie;
    @OneToMany
    @JoinColumn(name = "voiture_id")
    private Set<Voiture> voitures;
}
