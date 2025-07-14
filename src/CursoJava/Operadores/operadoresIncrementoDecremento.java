package CursoJava.Operadores;

public class operadoresIncrementoDecremento {
    public static void main(String[] args) {
        int i = 5;

        // Incremento
        int j = ++i; // Pre-incremento
        System.out.println("j = ++i: " + j); // Imprime 6
        System.out.println("i después del pre-incremento: " + i); // Imprime 6

        j = i++; // Post-incremento
        System.out.println("j = i++: " + j); // Imprime 6
        System.out.println("i después del post-incremento: " + i); // Imprime 7

        // Decremento
        j = --i; // Pre-decremento
        System.out.println("j = --i: " + j); // Imprime 6
        System.out.println("i después del pre-decremento: " + i); // Imprime 6

        j = i--; // Post-decremento
        System.out.println("j = i--: " + j); // Imprime 6
        System.out.println("i después del post-decremento: " + i); // Imprime 5
    }
}
