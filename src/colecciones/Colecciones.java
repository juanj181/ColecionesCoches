/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List<Coche> coches = new ArrayList<>();
        Coche coche1 = new Coche(Marca.Ford, "Focus", 1000, "48599967C");
        Coche coche2 = new Coche(Marca.Ford, "Mustang", 2500, "588874Z");
        Coche coche3 = new Coche(Marca.Citroen, "Xsara", 1200, "988875B");
        Coche coche4 = new Coche(Marca.Seat, "Toledo", 1500, "9866354X");
        Coche coche5 = new Coche(Marca.Renault, "Almera", 1200, "9876648C");


        coches.add(coche1);
        coches.add(coche2);
        coches.add(coche3);
        coches.add(coche4);
        coches.add(coche5);
        
    }
}
