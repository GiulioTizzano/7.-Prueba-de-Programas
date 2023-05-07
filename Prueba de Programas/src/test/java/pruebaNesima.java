import dominio.Matematicas;
import dominio.Matematicas.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class pruebaNesima {
    @Test
    public void SumaRecursivaTest(){
     int resultado = Matematicas.sumaPositivos(5);
     assertEquals(15, resultado);
    }
    @Test
    public void factorialCasobaseTest(){
        int resultado = Matematicas.factorialNumero(0);
    }
}
