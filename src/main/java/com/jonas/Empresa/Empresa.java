package com.jonas.Empresa;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Empresa {
    @JsonProperty ("nom")
    private String nom;
    @JsonProperty ("empleats")
    private List<Empleat> empleats;

    public Empresa() {}
    public Empresa(String nom, List<Empleat> empleats) {
        this.nom = nom;
        this.empleats = empleats;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Empleat> getEmpleats() {
        return empleats;
    }

    public void setEmpleats(List<Empleat> empleats) {
        this.empleats = empleats;
    }
// Getters i setters
}
