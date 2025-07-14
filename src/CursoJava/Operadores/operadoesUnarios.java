package CursoJava.Operadores;

public class operadoesUnarios {
    public static void main(String[] args) {
        int i = -5;

        int j = +i; // Operador unario positivo
        System.out.println("j = +i: " + j); // Imprime -5

        int k = -i; // Operador unario negativo
        System.out.println("k = -i: " + k); // Imprime 5

        i = 6;
        j = +i; // Operador unario positivo
        System.out.println("j = +i: " + j); // Imprime 6

        k = -i; // Operador unario negativo
        System.out.println("k = -i: " + k); // Imprime -6
    }
}
