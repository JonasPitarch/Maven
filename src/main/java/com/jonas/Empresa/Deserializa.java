package com.jonas.Empresa;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.Map;

public class Deserializa {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json = "src/main/resources/empresa.json";

            Map<String, Empresa> e = mapper.readValue(new File(json),
                    mapper.getTypeFactory().constructMapType(Map.class, String.class, Empresa.class));

            for (Map.Entry<String, Empresa> empresa : e.entrySet()) {
                System.out.println("Nom: " + empresa.getValue().getNom());
                System.out.println("Empleats: " + empresa.getValue().getEmpleats());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
