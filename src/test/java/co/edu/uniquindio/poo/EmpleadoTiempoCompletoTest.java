package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.logging.Logger;
import co.edu.uniquindio.poo.model.EmpleadoTiempoCompleto;

public class EmpleadoTiempoCompletoTest {

    private static final  Logger LOG = Logger.getLogger(EmpleadoTiempoCompletoTest.class.getName());

    /**
     * test para verificar el metodo calcular salario
     */
    @Test
    public void calcularSalarioCompleto(){
        LOG.info("iniciando test calcularSalarioCompleto");
        EmpleadoTiempoCompleto empleado1 = new EmpleadoTiempoCompleto("diego", "1115176545", 1000000);

        assertEquals(1000000, empleado1.calcularSalario());
        LOG.info("finalizando test calcularSalarioCompleto");
    }
    
}
