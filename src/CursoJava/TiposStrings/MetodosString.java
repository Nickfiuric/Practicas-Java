package CursoJava.TiposStrings;

public class MetodosString {
    public static void main(String[] args) {
        String nombre = "Alejandro";

        System.out.println("Longitud del nombre: " + nombre.length()); // Longitud del string
        System.out.println("nombre.toUpperCase(): " + nombre.toUpperCase()); // Convierte a mayúsculas
        System.out.println("nombre.toLowerCase(): " + nombre.toLowerCase()); // Convierte a minúsculas
        System.out.println("nombre.charAt(0): " + nombre.charAt(0)); // Obtiene el carácter en la posición 0
        System.out.println("nombre.indexOf('e'): " + nombre.indexOf('e')); // Encuentra la posición
        System.out.println("nombre.equals(\"Alejandro\"): " + nombre.equals("Alejandro")); // Compara si son iguales
        System.out.println("nombre.equals(\"alejandro\"): " + nombre.equals("alejandro")); // Compara si son iguales
        System.out.println("nombre.equalsIgnoreCase(\"alejandro\"): " + nombre.equalsIgnoreCase("alejandro")); // Compara ignorando mayúsculas/minúsculas
        System.out.println("nombre.compareTo(\"Alejandro\"): " + nombre.compareTo("Alejandro")); // Compara lexicográficamente
        System.out.println("nombre.compareTo(\"Zoe\"): " + nombre.compareTo("Zoe")); // Compara lexicográficamente
        System.out.println("nombre.substring(0, 4): " + nombre.substring(0, 4)); // Obtiene subcadena desde la posición 0 hasta 4
        System.out.println("nombre.substring(1): " + nombre.substring(1)); // Obtiene subcadena desde la posición 0 hasta 4

        String trabalenguas = "Trabalenguas";
        System.out.println("trabalenguas.replace('a', 'e'): " + trabalenguas.replace('a', 'e')); // Reemplaza 'a' por 'e'
        System.out.println("trabalenguas.indexOf('a'): " + trabalenguas.indexOf('a')); // Encuentra la posición de 'a'
        System.out.println("trabalenguas.lastIndexOf('a'): " + trabalenguas.lastIndexOf('a')); // Encuentra la última posición de 'a'
        System.out.println("trabalenguas.constains(\"len\"): " + trabalenguas.contains("len")); // Verifica si contiene "len"
        System.out.println("trabalenguas.startsWith(\"Trab\"): " + trabalenguas.startsWith("Trab")); // Verifica si empieza con "Trab"
        System.out.println("trabalenguas.endsWith(\"guas\"): " + trabalenguas.endsWith("guas")); // Verifica si termina con "guas"
        System.out.println("trabalenguas.trim(): " + trabalenguas.trim()); // Elimina espacios al inicio y al final
        System.out.println("trabalenguas.split(\"a\"): " + String.join(", ", trabalenguas.split("a"))); // Divide el string en un arreglo usando 'a' como delimitador
        System.out.println("trabalenguas.isEmpty(): " + trabalenguas.isEmpty()); // Verifica si el string está vacío
        System.out.println("trabalenguas.isBlank(): " + trabalenguas.isBlank()); // Verifica si el string está en blanco
        System.out.println("trabalenguas.repeat(2): " + trabalenguas.repeat(2)); // Repite el string 2 veces

        
    }
}
