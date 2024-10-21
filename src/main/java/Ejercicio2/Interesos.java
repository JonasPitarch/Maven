package Ejercicio2;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Interesos {
    @JacksonXmlProperty(localName = "interes")
    private String nombre;

    public Interesos(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
