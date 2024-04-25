package ejercicioscajanegra.ejercicio5calcularfactorial;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class CalcularFactorialTest {

    @Test
    @DisplayName("#1. Calcular factorial de 5")
    void calcularFactorial1() {

        String input = "5"; // Simular que el usuario introduce el número 5
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals(120, CalcularFactorial.calcularFactorial());
    }

    @Test
    @DisplayName("#2. Calcular factorial de 10")
    void calcularFactorial2() {

        String input = "10"; // Simular que el usuario introduce el número 10
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals(3628800, CalcularFactorial.calcularFactorial());
    }


}