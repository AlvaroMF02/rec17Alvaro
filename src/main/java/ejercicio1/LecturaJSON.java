package ejercicio1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;



/**
 *
 * @author alvaro
 */
public class LecturaJSON {
    
    //METODO
    public void listaViajes (ArrayList<Root> lista)throws IOException{
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.registerModule(new JavaTimeModule());
        
        ArrayList<Root> catalogo = mapeador.readValue(new File("cruceros.json"),
                    mapeador.getTypeFactory().constructCollectionType(ArrayList.class, Root.class));
        System.out.println("---- Lectura Root ----");
        for (Root muebleVO : catalogo) {
            System.out.println(muebleVO);
        }
    }

}
