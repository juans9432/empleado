package co.edu.uniquindio.poo.model;

public class EmpleadoPorHora extends Empleado {

    private double horasTrabajadas;
    private int salarioPorHora;

    /**
     * constructor de la clase
     */
    public EmpleadoPorHora(String nombre, String identificacion, double horasTrabajadas, int salarioPorHora){
        super(nombre, identificacion);
        this.horasTrabajadas=horasTrabajadas;
        this.salarioPorHora=salarioPorHora;
    }

    /**
     * metodo get para obtener las horas trabajadas
     */
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    /**
     * metodo set para modificar las horas trabajadas
     */
    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    /**
     * metodo get para obtener el salario por hora
     */
    public int getSalarioPorHora() {
        return salarioPorHora;
    }

    /**
     * metodo set para modificar el salario por hora
     * @param salarioPorHora
     */
    public void setSalarioPorHora(int salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * salarioPorHora;
    }

    

    
    
}
