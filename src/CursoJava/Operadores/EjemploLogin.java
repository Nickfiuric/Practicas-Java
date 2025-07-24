package CursoJava.Operadores;

import java.util.Scanner;

public class EjemploLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario (Desde consola)

        boolean usuarioValido = false;
        boolean contrasenaValida = false;

        String[] usuariosValidos = { "admin", "user1", "user2" }; // Lista de usuarios válidos
        String[] passwordsValidos = { "1234", "abcd", "qwerty" }; // Lista de contraseñas válidas

        String usuarioIngresado;
        String contrasenaIngresada;

        System.out.print("Ingrese su usuario: ");
        usuarioIngresado = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        contrasenaIngresada = scanner.nextLine();

        usuarioIngresado = usuarioIngresado.trim(); // Elimina espacios al inicio y al final

        for (String string : usuariosValidos) { // Recorre el arreglo de usuarios válidos
            if (usuarioIngresado.equalsIgnoreCase(string)) {
                usuarioValido = true; // Verifica si el usuario ingresado es uno de los usuarios válidos
                break; // Sale del bucle si encuentra un usuario válido
            }
        }

        for (String string : passwordsValidos) { // Recorre el arreglo de usuarios válidos
            if (contrasenaIngresada.equals(string)) {
                contrasenaValida = true; // Verifica si el usuario ingresado es uno de los usuarios válidos
                break; // Sale del bucle si encuentra un usuario válido
            }
        }

        boolean loginExitoso = usuarioValido && contrasenaValida; // Verifica si el login es exitoso

        if (loginExitoso) {
            System.out.println("Login exitoso. Bienvenido, " + usuarioIngresado + "!");
            System.exit(1); // Termina el programa si el login es exitoso
        } else {
            System.out.println("Login fallido. Usuario o contraseña incorrectos.");
            main(args); // Permite reintentar el login
        }

    }
}
