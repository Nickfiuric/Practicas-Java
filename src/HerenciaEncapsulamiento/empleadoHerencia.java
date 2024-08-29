package HerenciaEncapsulamiento;

/*El extends hace referencia a que vamos a realizar una herencia
 * hacia una clase.
 */
public class empleadoHerencia extends usuarioHerencia {
    /**
     * Atributos de mi clase hederada EmpleadoHerencia
     */
    String cargo;
    Double sueldo;

    /**
     * Metodo de tipo constructor donde tenemos los atributos de la clase
     * PersonaHerencia
     * como tambien tenemos las atrubutos de la clase metodos esto se debe a la Herencia
     */
    
    public empleadoHerencia(int id, int edad, String nombre, String apellido_pa, String apellido_ma, String cargo,
            Double sueldo) {
        super(id, edad, nombre, apellido_pa, apellido_ma);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

}
