import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dao.BD;
import model.Odontologo;
import services.OdontologoService;

public class OdontologoTest {
    @Test 
    public void buscarUnOdontologo(){
        BD.crearTabla();
        OdontologoService odontologoService = new OdontologoService();
        Integer busqueda = 1;
        Odontologo odontologo = odontologoService.buscarOdontologo(busqueda);
        Assertions.assertTrue(odontologo != null);
    }
}
