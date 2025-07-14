package CursoJava.Operadores;

public class operadoresDeAsignacion {
    public static void main(String[] args) {
        int i = 5;
        i += 2; // Equivalente a i = i + 2
        System.out.println("i += 2: " + i); // Imprime 7

        i -= 3; // Equivalente a i = i - 3
        System.out.println("i -= 3: " + i); // Imprime 4

        i *= 5; // Equivalente a i = i * 5
        System.out.println("i *= 5: " + i); // Imprime 8

        i /= 4; // Equivalente a i = i / 4
        System.out.println("i /= 4: " + i); // Imprime 2

        i %= 2; // Equivalente a i = i % 2
        System.out.println("i %= 2: " + i); // Imprime 0
    }
}
