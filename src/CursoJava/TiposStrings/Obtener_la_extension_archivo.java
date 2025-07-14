package CursoJava.TiposStrings;

public class Obtener_la_extension_archivo {
    public static void main(String[] args) {
        String archivo = "documento.pdf";
        Integer punto = archivo.lastIndexOf("."); // Encuentra la última posición del punto

        System.out.println("archivo.length(): " + archivo.length()); // Longitud del string
        System.out.println("archivo.substring(\"punto\") " + archivo.substring(punto)); // Obtiene la subcadena desde el último punto
        System.out.println("archivo.substring(\"punto\") " + archivo.substring(punto+1)); // Obtiene la extensión del archivo

    }
}
