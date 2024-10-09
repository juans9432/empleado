package co.edu.uniquindio.poo.model;

public abstract class Empleado {

    private String nombre, identificacion;

    /**
     * constructor de la clase empleado
     * @param nombre
     * @param identificacion
     */
    public Empleado(String nombre, String identificacion){
        this.nombre=nombre;
        this.identificacion=identificacion;
    }

    /**
     *metodo get para obtener el nombre 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * metodo set para modificar el nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * metodo get para obtener la identificacion
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * metodo set para modificar la identificacion
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public abstract double calcularSalario();
 
}
