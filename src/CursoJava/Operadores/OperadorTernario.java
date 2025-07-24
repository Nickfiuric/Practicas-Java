package CursoJava.Operadores;

public class OperadorTernario {

    public static void main(String[] args){

        // variable = condicion ? valorSiVerdadero : valorSiFalso;  (Uso de operador ternario)

        String respuesta = 10 > 5 ? "10 es mayor que 5" : "10 no es mayor que 5"; // Si la condición es verdadera, se asigna el primer valor; si es falsa, el segundo.]
        System.out.println(respuesta); // Imprime "10 es mayor que 5"        

        String estado = "";
        Integer edad = 18;

        estado =  edad != 18 ? "Eres mayor de edad" : "Eres menor de edad"; // Si la condición es verdadera, se asigna el primer valor; si es falsa, el segundo.
        System.out.println(estado); // Imprime "Eres mayor de edad"

    }
}