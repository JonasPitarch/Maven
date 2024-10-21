package com.jonas.Projecte;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class main {
    public static void main(String[] args) {
        try {
            Persona p = new Persona("Jonas",20,false);
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File("simple2.json"),p);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
