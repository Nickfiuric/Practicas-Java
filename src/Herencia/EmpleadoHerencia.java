package Herencia;

/*El extends hace referencia a que vamos a realizar una herencia
 * hacia una clase.
 */
public class EmpleadoHerencia extends PersonaHerencia {
    /*
     * Atributos de mi clase hederada EmpleadoHerencia
     */
    String cargo;
    Double sueldo;

    /*
     * Metodo de tipo constructor donde tenemos los atributos de la clase
     * PersonaHerencia
     * como tambien tenemos las atrubutos de la clase metodos
     */
    public EmpleadoHerencia(String nombre, String domicilio, String telefono, int ide, String cargo,
            Double sueldo) {
        super(nombre, domicilio, telefono);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

}
