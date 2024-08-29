package Abstractas;

public class Cuadrado implements figuraAbracta, Dibujable {

    double lado;
    
     public Cuadrado(double lado) {
        this.lado = lado;
    }

    /**
     * Metodo de la clase madre a la cual le vamos a mandar datos.
     */
    @Override
    public double calcularArea() {
       double resultado = lado * lado;
       return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Hola estoy dibujando un cuadrado");
    }


}
