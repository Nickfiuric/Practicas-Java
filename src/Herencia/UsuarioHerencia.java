package Herencia;
//!Lo que se realizo fue realizar una clase llamada Persona la cual tiene unos atributos que conforman a una persona en
//!la cual tiene un metodo contructor pare poder crear objetos mediante una instancia.

/**
 * Clase llamada Personas.
 */
public class UsuarioHerencia {
    /**
     * Atributos.
     */
    int id;
    int edad;
    String nombre;
    String apellido_pa;
    String apellido_ma;

    /**
     * Constructores con parametros a llamar.
     * @param id
     * @param edad
     * @param nombre
     * @param apellido_pa
     * @param apellido_ma
     */
    public UsuarioHerencia(int id, int edad, String nombre, String apellido_pa, String apellido_ma) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido_pa = apellido_pa;
        this.apellido_ma = apellido_ma;
    }

    /**
     *Creamos nuestros get and set
     * @return
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_pa() {
        return apellido_pa;
    }

    public void setApellido_pa(String apellido_pa) {
        this.apellido_pa = apellido_pa;
    }

    public String getApellido_ma() {
        return apellido_ma;
    }

    public void setApellido_ma(String apellido_ma) {
        this.apellido_ma = apellido_ma;
    }

}
