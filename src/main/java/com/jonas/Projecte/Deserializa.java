package com.jonas.Projecte;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Deserializa {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Persona p = mapper.readValue(new File("src/main/resources/simple.json"), Persona.class);
            System.out.println(p.getNom());
            System.out.println(p.getEdad());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}