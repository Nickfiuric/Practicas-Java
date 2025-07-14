package CursoJava.Operadores;

public class operadoresLogicos {

    public static void main(String[] args) {
    int i = 3;
    byte j = 3;
    float k = 2.5f;
    double l = 3.14;
    boolean n = true;
    

    boolean b1 = i ==  j && k < l; // AND lógico
    System.out.println("b1 (i == j && k < l): " + b1); // Imprime false

    boolean b2 = i != j || k > l; // OR lógico
    System.out.println("b2 (i != j || k > l): " + b2); // Imprime true

    boolean b3 = !(i < j); // NOT lógico
    System.out.println("b3 (!(i < j)): " + b3); // Imprime true

    boolean b4 = n && (i < j || k > l); // Combinación de AND y OR
    System.out.println("b4 (n && (i < j || k > l)): " + b4); // Imprime true

    boolean b5 = n || (i > j && k < l); // Combinación de OR y AND
    System.out.println("b5 (n || (i > j && k < l)): " + b5); // Imprime true

    boolean b6 = (i < j && k > l) || n; // Combinación de AND, OR y NOT
    System.out.println("b6 ((i < j && k > l) || n): " + b6); // Imprime true

    boolean b7 = (i == j) && (k < l) || n; // Combinación de AND, OR y NOT
    System.out.println("b7 ((i == j) && (k < l) || n): " + b7); // Imprime true

    boolean b8 = (i != j) || (k > l) && n; // Combinación de OR, AND y NOT
    System.out.println("b8 ((i != j) || (k > l) && n): " + b8); // Imprime true

    
    }
    
}
