package ejercicioscajanegra.ejemplo2apuntescajanegra;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacturaTest {

    @Test
    @DisplayName("#1. Sin recargo")
    void recargo1() {
        assertEquals("sin recargo", Factura.recargo(10));
    }


    @Test
    @DisplayName("#2. Recargo del 2%")
    void recargo2() {
        assertEquals("recargo del 2%", Factura.recargo(11));
    }

    @Test
    @DisplayName("#3. Recargo del 4%")
    void recargo3() {
        assertEquals("recargo del 4%", Factura.recargo(21));
    }

    @Test
    @DisplayName("#4. Día no válido")
    void recargo4() {
        assertEquals("día inválido", Factura.recargo(32));
    }
}