package Abstractas;

public class Circulo implements figuraAbracta,Rotable,Dibujable {

    double radio;


    public Circulo(double radio) {
        this.radio = radio;
    }

    /**
     * Metodo de la clase madre a la cual le vamos a mandar datos.
     */
    @Override
    public double calcularArea() {
       double pi = 3.1416;
       double resultado = pi * radio * radio;
       return resultado;
    }


    @Override
    public void dibujar() {
        System.out.println("Hola estoy dibujando un circulo");
    }

    @Override
    public void rotar() {
        System.out.println("Hola, estoy rotando el circulo");
    }

    
}
