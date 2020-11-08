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
public class Marque {
    @Id
    private int id;
    private String name;
    @OneToMany
    @JoinColumn(name = "marque_id")
    private Set<Marque> marques;
}
