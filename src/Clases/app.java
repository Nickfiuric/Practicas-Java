package Clases;
public class app {
    public static void main(String[] args) throws Exception {
        /*Se llama la clase Persona para luego crer un objeto llamado persona*/
        usuario personas = new usuario(1, 18, "Alejandro", "Hernandez", "Hernandez");
        System.out.println("Datos de las personas"+ personas.nombre);
    }
}