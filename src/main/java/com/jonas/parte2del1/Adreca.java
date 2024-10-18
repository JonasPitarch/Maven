package com.jonas.parte2del1;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Adreca {
    @JacksonXmlProperty(localName = "tipus")
    private String tipus;

    @JacksonXmlProperty(localName = "carrer")
    private String carrer;

    @JacksonXmlProperty(localName = "ciutat")
    private String ciutat;

    // Constructors
    public Adreca() {}

    public Adreca(String tipus, String carrer, String ciutat) {
        this.tipus = tipus;
        this.carrer = carrer;
        this.ciutat = ciutat;
    }

    // Getters i Setters
    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getCarrer() {
        return carrer;
    }

    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }

    public String getCiutat() {
        return ciutat;
    }

    public void setCiutat(String ciutat) {
        this.ciutat = ciutat;
    }
}
