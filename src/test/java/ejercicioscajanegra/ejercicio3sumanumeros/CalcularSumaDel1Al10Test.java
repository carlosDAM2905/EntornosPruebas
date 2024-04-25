package ejercicioscajanegra.ejercicio3sumanumeros;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcularSumaDel1Al10Test {

    @Test
    @DisplayName("Caso 1. (resultado 55)")
    void calcularSuma1() {
        assertEquals(55, CalcularSumaDel1Al10.calcularSuma());
    }


}