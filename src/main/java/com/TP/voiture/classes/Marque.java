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
public class Marque {
    @Id
    private int id;
    private String name;
    private List<Voiture> voitures;
    @OneToMany
    @JoinColumn(name = "marque_id")
    private Set<Marque> marques;
}
