package co.edu.uniquindio.poo.model;

public class EmpleadoTiempoCompleto extends Empleado{

    private int salarioMensual;

    /**
     * constructor de la clase EmpleadoTiempoCompleto
     */
    public EmpleadoTiempoCompleto(String nombre, String identificacion, int salarioMensual){
        super(nombre, identificacion);
        this.salarioMensual=salarioMensual;
    }

    /**
     * metodo get para obtener el salario
     */
    public int getSalarioMensual() {
        return salarioMensual;
    }

    /**
     * metodo set para modificar el salario
     * @param salarioMensual
     */
    public void setSalarioMensual(int salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSalario() {
        return salarioMensual;
    }
}
