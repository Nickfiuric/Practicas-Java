package CursoJava.TiposStrings;

public class Inmutable {
    
    public static void main(String[] args) {
    
        String curso = "Curso de Java";
        String alumno = "Alejandro Hernandez";
    
        // Inmutamos el curso con el nombre en un nuevo objeto String
        String cursoInmutable = curso.concat(alumno);
        System.out.println(cursoInmutable);

        // Remplazamos todas las a por A
        String cursoRemplazado = curso.replace("a", "A");
        System.err.println(cursoRemplazado);

    }
}