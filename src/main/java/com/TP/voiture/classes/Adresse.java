package com.TP.voiture.classes;

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
public class Adresse {
    @Id
    private int id;
    private Integer numero;
    private String rue;
    private String ville;
    private Integer codePostal;
    @OneToMany
    @JoinColumn(name = "adresse_id")
    private Set<Adresse> adresses;

}
