package ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class LecturaCSV {
    public static void main(String[] args) {
        // Fichero a leer con datos de ejemplo
        String idFichero = "indicator.csv";

        // Variables 
        ArrayList<Municipio> lista = new ArrayList<>();
        String[] tokens;        
        String linea;

        System.out.println("Se está leyendo el fichero: " + idFichero + "\n");

        try ( Scanner datos = new Scanner(new  File(idFichero))) {
            datos.nextLine();
            
            while (datos.hasNextLine()) {//mientras que haya lineas sigue el bucle
                linea = datos.nextLine();  //para que salte de linea
                                
                tokens = linea.split(";");  //indica el separador                
                
                Municipio m1 = new Municipio(); //guardar todo lo de token 
                
                m1.setCodMunicipio(tokens[0]); //metes informacion de tokens al objeto p1
                m1.setMunicipio(tokens[1]);
                m1.setAnio2016(tokens[2]);
                m1.setAnio2015(tokens[3]);
                m1.setAnio2014(tokens[4]);
                m1.setAnio2013(tokens[5]);
                m1.setAnio2011(tokens[6]);
                m1.setAnio2010(tokens[7]);
                m1.setAnio2006(tokens[8]);
                m1.setAnio2001(tokens[9]);
                m1.setAnio1996(tokens[10]);
            }
                
            
            
            }catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            }
        
            //imprimir lista
            for (Municipio p : lista) {
                System.out.println(p.toString());
            }
            
    }
    
    
}
