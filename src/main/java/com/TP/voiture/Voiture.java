package com.TP.voiture;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Voiture {
    @Id
    private int id;
    private String name;
    @OneToMany
    @JoinColumn(name = "voiture_id")
    private Set<Voiture> voitures;
}
