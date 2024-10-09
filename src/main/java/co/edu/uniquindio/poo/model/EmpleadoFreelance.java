package co.edu.uniquindio.poo.model;

public class EmpleadoFreelance extends Empleado {

    private double proyectosCompletados, pagoPorProyecto;

    /**
     * constructor de la clase 
     */
    public EmpleadoFreelance(String nombre, String identificacion, double proyectosCompletados, double pagoPorProyecto){
        super(nombre, identificacion);
        this.proyectosCompletados=proyectosCompletados;
        this.pagoPorProyecto=pagoPorProyecto;
    }

    /**
     * metodo get para obtener los proyectos completados
     */
    public double getProyectosCompletados() {
        return proyectosCompletados;
    }

    /**
     * metodo set para modificar los proyectos completados
     * @param proyectosCompletados
     */
    public void setProyectosCompletados(double proyectosCompletados) {
        this.proyectosCompletados = proyectosCompletados;
    }

    /**
     * metodo get para obtener el pago por proyecto
     * @return
     */
    public double getPagoPorProyecto() {
        return pagoPorProyecto;
    }

    /**
     * metodo set para modificar el pago por proyecto
     * @param pagoPorProyecto
     */
    public void setPagoPorProyecto(double pagoPorProyecto) {
        this.pagoPorProyecto = pagoPorProyecto;
    }

    @Override
    public double calcularSalario() {
        return proyectosCompletados * pagoPorProyecto;
    }

    

    
    
}
