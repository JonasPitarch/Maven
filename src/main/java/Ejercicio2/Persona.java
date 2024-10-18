package Ejercicio2;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.jonas.Adreca;

import java.util.List;

public class Persona {
    @JacksonXmlProperty(localName = "nom")
    private String nom;

    @JacksonXmlProperty(localName = "edat")
    private int edat;

    @JacksonXmlElementWrapper(localName = "contactes")
    @JacksonXmlProperty(localName = "contacte")
    private List<HistorialContacte> contactes;
    @JacksonXmlElementWrapper(localName = "Adreçes")
    @JacksonXmlProperty(localName = "Adreça")
    private List<Adreca>adrecas;

    public Persona(String nom, int edat, List<HistorialContacte> contactes, List<Adreca> adrecas) {
        this.nom = nom;
        this.edat = edat;
        this.contactes = contactes;
        this.adrecas = adrecas;
    }

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

    public List<HistorialContacte> getContactes() {
        return contactes;
    }

    public void setContactes(List<HistorialContacte> contactes) {
        this.contactes = contactes;
    }

    public List<Adreca> getAdrecas() {
        return adrecas;
    }

    public void setAdrecas(List<Adreca> adrecas) {
        this.adrecas = adrecas;
    }
}
