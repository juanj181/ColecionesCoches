/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

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
        
        String entradaTeclado;
        
        Map<String, Coche> mapCoches = new HashMap<>();
        
        List<Coche> coches = new ArrayList<>();
        Coche coche1 = new Coche(Marca.Ford, "Focus", 1000, "48599967C");
        Coche coche2 = new Coche(Marca.Ford, "Mustang", 2500, "12345678Z");
        Coche coche3 = new Coche(Marca.Citroen, "Xsara", 1200, "988875B");
        Coche coche4 = new Coche(Marca.Seat, "Toledo", 1500, "9866354X");
        Coche coche5 = new Coche(Marca.Renault, "Almera", 1200, "9876648C");

        //añadimos a la lista los objetos.
        coches.add(coche1);
        coches.add(coche2);
        coches.add(coche3);
        coches.add(coche4);
        coches.add(coche5);
        
        //añadimos al map los objetos.
        mapCoches.put(coche1.getDniPropietario(),coche1);
        mapCoches.put(coche2.getDniPropietario(),coche2);
        mapCoches.put(coche3.getDniPropietario(),coche3);
        mapCoches.put(coche4.getDniPropietario(),coche4);
        mapCoches.put(coche5.getDniPropietario(),coche5);
        
        
        Coche i = mapCoches.get("12345678Z");
        System.out.println(i.getModelo()+" "+i.getMarca()+" "+i.getCilindrada());
/*
        System.out.println(coche1.getMarca());


        for (int i = 0; i < coches.size(); i++) {
            System.out.println(coches.get(i).getMarca()+" "+coches.get(i).getModelo());
        }
        
        
        System.out.println("Introduzca un dni: ");
         Scanner entradaEscaner = new Scanner (System.in);
         
         entradaTeclado = entradaEscaner.nextLine ();
         //entradaTeclado = (String).System.read;
         
         for (int i = 0; i < coches.size(); i++) {
             
            if(entradaTeclado.equals(coches.get(i).getDniPropietario()) ){
                System.out.println(coches.get(i).getModelo());
            }
        }
         for (int i = 0; i < coches.size(); i++) {
             if(coches.get(i).getMarca().equals(Marca.Ford)){
                 System.out.println(coches.get(i).getModelo()+" "+coches.get(i).getDniPropietario()+" "+coches.get(i).getCilindrada());
             }
            
        }
         */

    }
}
