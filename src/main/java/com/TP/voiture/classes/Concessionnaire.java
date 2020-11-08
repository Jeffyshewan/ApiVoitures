package com.TP.voiture.classes;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Concessionnaire {
    @Id
    private int id;
    private String name;
    private Adresse adresse;
    private List<Marque> marques;
    private List<Client> clients;
    private List<Voiture> voitures;
    @OneToMany
    @JoinColumn(name = "concessionnaire_id")
    private Set<Concessionnaire> concessionnaires;
}
