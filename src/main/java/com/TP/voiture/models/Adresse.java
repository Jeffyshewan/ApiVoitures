package com.TP.voiture.models;

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
    private int numero;
    private String rue;
    private String ville;
    private int code_postal;
    @OneToMany
    @JoinColumn(name = "adresse_id")
    private Set<Adresse> adresses;

}
