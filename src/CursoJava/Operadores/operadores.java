package CursoJava.Operadores;

public class operadores {
    public static void main(String[] args) {
        
        Integer a = 0;
        System.out.println(++a); // Pre-incremento, imprime 1
        System.out.println(a++); // Post-incremento, imprime 1 pero a ahora

        //Operadores ternarios o condicionales
        // (condicion) ? valorSiVerdadero : valorSiFalso
        Integer b = 2 > 3 ? 1 : 2;
        System.out.println("si se cumple"+b); // Imprime 2, ya que 2 > 3
    }
}
