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
public class Client {
    @Id
    private int id;
    private String name;
    private List<Voiture> voitures;
    private Adresse adresse;
    @OneToMany
    @JoinColumn(name = "client_id")
    private Set<Client> clients;
}
