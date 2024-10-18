package Ejercicio2;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.jonas.Adreca;
import com.jonas.Persona;

import java.io.File;

public class main {
    public static void main(String[] args) {
        XmlMapper xmlMapper = new XmlMapper();
        File xmlFile = new File("src/main/resources/datosp.xml");

        try {
            if (xmlFile.exists()) {
                Persona persona = xmlMapper.readValue(xmlFile, Persona.class);

                System.out.println("Nom: " + persona.getNom());
                System.out.println("Edat: " + persona.getEdat());
                System.out.println("Contacte: " + persona.get());


                for (Adreca adreca : persona.getAdreces()) {
                    System.out.println("Tipus d'adreça: " + adreca.getTipus());
                    System.out.println("Carrer: " + adreca.getCarrer());
                    System.out.println("Ciutat: " + adreca.getCiutat());
                    System.out.println();
                }
            } else {
                System.err.println("El fitxer XML no existeix.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
