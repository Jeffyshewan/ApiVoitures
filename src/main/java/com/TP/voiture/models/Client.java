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
public class Client {
    @Id
    private int id;
    private String name;
    private String voitures;
    @OneToMany
    @JoinColumn(name = "client_id")
    private Set<Client> clients;
}
