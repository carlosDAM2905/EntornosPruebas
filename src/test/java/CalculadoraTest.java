import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test

    void prueba1suma() {
        assertEquals(4, Calculadora.sumar(2, 2)); //caso de prueba
    }
    @Test
    void prueba2suma(){
        assertEquals(0, Calculadora.sumar(2,-2));
    }

    @Test
    void prueba3resta(){
        assertEquals(-14000, Calculadora.restar(1000,15000));
    }

    @Test
    void prueba4resta(){
        assertEquals(-33, Calculadora.restar(-3,30));
    }

    @Test
    void prueba5multiplicacion(){
        assertEquals(0, Calculadora.multiplicar(0,5));
    }
    @Test
    void prueba6multiplicacion(){
        assertEquals(1000, Calculadora.multiplicar(1000,1));
    }

    @Test
    void prueba7division(){
        assertEquals(0, Calculadora.dividir(0,5));
    }

    @Test
    void prueba8division(){
        assertEquals(0.10, Calculadora.dividir(1,10));
    }

}