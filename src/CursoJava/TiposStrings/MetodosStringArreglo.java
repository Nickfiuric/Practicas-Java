package CursoJava.TiposStrings;

public class MetodosStringArreglo {
    public static void main(String[] args) {
        String trabalenguas = "Trabalenguas";
        System.out.println("trabalenguas.toCharArray(): "+ trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("arreglo[" + i + "]: " + arreglo[i]);
        }

        System.out.println("trabalenguas : " + trabalenguas.split("a")); // Divide el string en un arreglo usando 'a' como delimitador

        String[] arreglo2 = trabalenguas.split("a"); // Divide el string en un arreglo usando 'a' como delimitador

        for (int i = 0; i < arreglo2.length; i++) {
            System.out.println("arreglo2[" + i + "]: " + arreglo2[i]); // Imprime cada elemento del arreglo
        }



    }
}