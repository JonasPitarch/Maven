package com.jonas.parte2del1;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        XmlMapper xmlMapper = new XmlMapper();
        Persona persona = new Persona();
        persona.setNom("Jaume Aragó");
        persona.setEdat(68);
        persona.setNotes("Esta és una persona molt important.");
        List<Adreca> adreces = new ArrayList<>();
        Adreca casa = new Adreca();
        casa.setTipus("casa");
        casa.setCarrer("Avinguda Datileres");
        casa.setCiutat("Benizahat");
        adreces.add(casa);
        Adreca oficina = new Adreca();
        oficina.setTipus("oficina");
        oficina.setCarrer("Canto del Bobet");
        oficina.setCiutat("Benigaslo");
        adreces.add(oficina);
        persona.setAdreces(adreces);
        try {
            String xml = xmlMapper.writeValueAsString(persona);
            System.out.println(xml);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

