package List;

import java.util.ArrayList;
import java.util.List;

import Clases.usuario;

/**
 * appList
 */
public class appList {

    public static void main(String[] args) {
        List<usuario> list = new ArrayList<usuario>();
        list.add(new usuario(1, 25, "Alejandro", "Hernandez", "Hernandez"));
        
        /**
         * Tenemos que recorrer la lista en su posicion i 
         * ejemplo list.get(i).getId();
         */
        for(int i = 0; i<list.size();i++){
            System.out.println("Datos: "+ list.get(i).getId());
            System.out.println("Datos: "+ list.get(i).getNombre());
            System.out.println("Datos: "+ list.get(i).getApellido_pa());
        }
        

    }
}