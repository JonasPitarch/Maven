package com.jonas.Projecte;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Persona {
    @JsonProperty ("nom")
    private String nom;
    @JsonProperty ("edat")
    private int edad;

    private boolean actiu;


    public Persona() {

    }

    public Persona(String nom, int edad, boolean actiu) {
        this.nom = nom;
        this.edad = edad;
        this.actiu = actiu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isActiu() {
        return actiu;
    }

    public void setActiu(boolean actiu) {
        this.actiu = actiu;
    }
}
