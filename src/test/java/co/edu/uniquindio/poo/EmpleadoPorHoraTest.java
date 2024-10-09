package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import co.edu.uniquindio.poo.model.EmpleadoPorHora;
import java.util.logging.Logger;

public class EmpleadoPorHoraTest {

    private static final  Logger LOG = Logger.getLogger(EmpleadoPorHoraTest.class.getName());

    /**
     * test para verificar el metodo calcular salario 
     */
    @Test
    public void calcularSalarioHora(){
        LOG.info("iniciando test calcularSalarioPorHora");
        EmpleadoPorHora empleado2 = new EmpleadoPorHora("jose", "66987345", 48, 15000);

        assertEquals(720000, empleado2.calcularSalario());
        LOG.info("finalizando test calcularSalarioPorHora");
    }    
}
