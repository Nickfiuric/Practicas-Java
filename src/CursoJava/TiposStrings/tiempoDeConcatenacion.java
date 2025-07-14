package CursoJava.TiposStrings;

public class tiempoDeConcatenacion {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        Long inicio = System.currentTimeMillis();

        for (int i = 0; i < 500; i++) {
            // c = c.concat(a).concat(b).concat("\n"); //tarda 2ms
            // c += a + b + "\n"; //tarda 60ms
            sb.append(a).append(b).append("\n"); // tarda 2ms

        }

        // Imprimimos el tiempo en que demora
        Long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);

        System.err.println("c = " + sb.toString());

    }
}
