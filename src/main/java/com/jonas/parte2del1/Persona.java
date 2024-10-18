package com.jonas.parte2del1;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import java.util.List;

public class Persona {
    @JacksonXmlProperty(localName = "nom")
    private String nom;

    @JacksonXmlProperty(localName = "edat")
    private int edat;

    @JacksonXmlElementWrapper(localName = "adreces")
    @JacksonXmlProperty(localName = "adreca")
    private List<Adreca> adreces;

    @JacksonXmlText
    private String notes;

    // Constructors
    public Persona() {}

    public Persona(String nom, int edat, List<Adreca> adreces, String notes) {
        this.nom = nom;
        this.edat = edat;
        this.adreces = adreces;
        this.notes = notes;
    }

    // Getters i Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public List<Adreca> getAdreces() {
        return adreces;
    }

    public void setAdreces(List<Adreca> adreces) {
        this.adreces = adreces;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}


