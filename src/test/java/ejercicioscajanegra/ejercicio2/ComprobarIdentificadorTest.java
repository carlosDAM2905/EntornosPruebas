package ejercicioscajanegra.ejercicio2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComprobarIdentificadorTest {
    ComprobarIdentificador cID = new ComprobarIdentificador();

    @Test
    @DisplayName("Cobertura 1, 4, 6, 9, 11 - identificador válido")
    void validarIdentificador1() {
        cID.setIdentificador("Progra--mador-1");
        assertTrue(cID.validarIdentificador());
    }

    @Test
    @DisplayName("Cobertura 2 - identificador corto (longitud menor o igual a 4 caracteres)")
    void validarIdentificador2() {
        cID.setIdentificador("Prog");
        assertFalse(cID.validarIdentificador());
    }

    @Test
    @DisplayName("Cobertura 3 - identificador largo (mayor o igual a 16 caracteres)")
    void validarIdentificador3() {
        cID.setIdentificador("Progra--mador-112");
        assertFalse(cID.validarIdentificador());
    }

    @Test
    @DisplayName("Cobertura 5 - que el identificador no tenga ninguno de los tres: ni letras, ni dígitos, ni guión")
    void validarIdentificador5() {
        cID.setIdentificador("$$$###_?");
        assertFalse(cID.validarIdentificador());
    }

    @Test
    @DisplayName("Cobertura 7 - el identificador tenga guión al principio")
    void validarIdentificador7() {
        cID.setIdentificador("-Progra--mador");
        assertFalse(cID.validarIdentificador());
    }

    @Test
    @DisplayName("Cobertura 8 - el identificador tenga guión al final")
    void validarIdentificador8() {
        cID.setIdentificador("Progra--mador-");
        assertFalse(cID.validarIdentificador());
    }

    @Test
    @DisplayName("Cobertura 10 - que no tenga ninguna letra")
    void validarIdentificador10() {
        cID.setIdentificador("12345-6789");
        assertFalse(cID.validarIdentificador());
    }

    @Test
    @DisplayName("Cobertura 12 - el identificador es una palabra reservada")
    void validarIdentificador12() {
        cID.setIdentificador("boolean");
        assertFalse(cID.validarIdentificador());
    }
}