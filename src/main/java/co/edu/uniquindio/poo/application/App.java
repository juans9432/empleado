package co.edu.uniquindio.poo.application;

import co.edu.uniquindio.poo.model.EmpleadoFreelance;
import co.edu.uniquindio.poo.model.EmpleadoPorHora;
import co.edu.uniquindio.poo.model.EmpleadoTiempoCompleto;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args){

        EmpleadoTiempoCompleto emp = new EmpleadoTiempoCompleto("robinson", "1234567890", 17000000);
        double salario = emp.calcularSalario();
        System.out.println("el salario mensual es: "+salario);

        EmpleadoPorHora emp2 = new EmpleadoPorHora("miguel", "111111111", 57, 15000);
        double salario2 = emp2.calcularSalario();
        System.out.println("el salario es: "+salario2);

        EmpleadoFreelance emp3 = new EmpleadoFreelance("alan", "1010101010", 25, 500000);
        double salario3 = emp3.calcularSalario();
        System.out.println("el salario es: "+salario3);

    }
}
