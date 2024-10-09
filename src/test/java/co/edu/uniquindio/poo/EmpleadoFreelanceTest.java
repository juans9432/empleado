package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.model.EmpleadoFreelance;

import java.util.logging.Logger;

public class EmpleadoFreelanceTest {

    private static final  Logger LOG = Logger.getLogger(EmpleadoFreelanceTest.class.getName());

    /**
     * test para verificar el metodo calcular salario 
     */
    @Test
    public void calcularSalarioProyecto(){
        LOG.info("iniciando test calcularSalarioProyecto");
        EmpleadoFreelance empleado3 = new EmpleadoFreelance("arturo", "94234756", 20, 900000);

        assertEquals(18000000, empleado3.calcularSalario());
        LOG.info("finalizando test calcularSalarioProyecto");
    }
    
}
