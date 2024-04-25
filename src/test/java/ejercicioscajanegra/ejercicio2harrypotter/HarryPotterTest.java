package ejercicioscajanegra.ejercicio2harrypotter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HarryPotterTest {

    @Test
    @DisplayName("Caso 1")
    void identificarCasa1() {
        assertEquals("valentía",HarryPotter.identificarCasa(1));
    }

    @Test
    @DisplayName("Caso 2")
    void identificarCasa2() {
        assertEquals("lealtad",HarryPotter.identificarCasa(2));
    }

    @Test
    @DisplayName("Caso 3")
    void identificarCasa3() {
        assertEquals("astucia",HarryPotter.identificarCasa(3));
    }

    @Test
    @DisplayName("Caso 4")
    void identificarCasa4() {
        assertEquals("intelecto",HarryPotter.identificarCasa(4));
    }

    @Test
    @DisplayName("Caso 5")
    void identificarCasa5() {
        assertEquals("no es una casa válida",HarryPotter.identificarCasa(5));
    }
}