package ejercicioscajanegra.ejerciciodni;



import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LectorDNITest {

    LectorDNI lector = new LectorDNI();

    @Test
    @DisplayName("Cobertura #1, #4, #7")
    void validarDNI1() {
        lector.setDni("47898536R");
        assertTrue(lector.validarDNI());

    }

    @Test
    @DisplayName("Cobertura #2")
    void validarDNI2() {
        lector.setDni("478985365R");
        assertFalse(lector.validarDNI());
    }


    @Test
    @DisplayName("Cobertura #3")
    void validarDNI3() {
        lector.setDni("4789853R");
        assertFalse(lector.validarDNI());
    }

    @Test
    @DisplayName("Cobertura #5")
    void validarDNI5() {
        lector.setDni("R47898536");
        assertFalse(lector.validarDNI());
    }

    @Test
    @DisplayName("Cobertura #6")
    void validarDNI6() {
        lector.setDni("4789R8536");
        assertFalse(lector.validarDNI());
    }
    @Test
    @DisplayName("Cobertura #7")
    void validarDNI7() {
        lector.setDni("47898536T");
        assertFalse(lector.validarDNI());
    }
}