package CursoJava.TiposStrings;

public class ValidarString {
    public static void main(String[] args) {

        String curso = null;

        boolean esNuelo = curso == null; // Validamos si es unlo con el ==

        if (esNuelo) {
            System.out.println("Es nulo: " + esNuelo);
        }

        // Validamos si un string tiene una longitud mayor a 0
        // boolean esVacio = curso.length() == 0; 
        // if (!esVacio) {
        //     // System.out.println(c);
        // }

    
        // Validamos si un string si es nulo o no
        boolean esNueloEmpty = curso.isEmpty(); // isEmpty valida si es nulo o vacio
        System.out.println("Es nulo o vacio: " + esNueloEmpty);

    }
}
