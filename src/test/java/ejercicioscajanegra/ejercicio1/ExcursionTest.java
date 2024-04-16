package ejercicioscajanegra.ejercicio1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcursionTest {

    Excursion excursion;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Precio alumno: 100 alumnos")
    void calcularPrecioAlumno1() {
        excursion = new Excursion(100); // instancio el objeto excursión con 100 alumnos
        assertEquals(65, excursion.calcularPrecioAlumno());
    }

    @Test
    @DisplayName("Precio alumno: 50 alumnos")
    void calcularPrecioAlumno2() {
        excursion = new Excursion(50); // instancio el objeto excursión con 100 alumnos
        assertEquals(70, excursion.calcularPrecioAlumno());
    }

    @Test
    @DisplayName("Precio alumno: 30 alumnos")
    void calcularPrecioAlumno3() {
        excursion = new Excursion(30); // instancio el objeto excursión con 100 alumnos
        assertEquals(95, excursion.calcularPrecioAlumno());
    }

    @Test
    @DisplayName("Precio alumno: 29 alumnos")
    void calcularPrecioAlumno4() {
        excursion = new Excursion(29); // instancio el objeto excursión con 100 alumnos
        assertEquals((4000/29), excursion.calcularPrecioAlumno());
    }

    @Test
    @DisplayName("Coste total 100 alumnos")
    void calcularCosteExcursion1() {
        excursion = new Excursion(100);
        assertEquals(6500, excursion.calcularCosteExcursion());
    }

    @Test
    @DisplayName("Coste total 50 alumnos")
    void calcularCosteExcursion2() {
        excursion = new Excursion(50);
        assertEquals(3500, excursion.calcularCosteExcursion());
    }

    @Test
    @DisplayName("Coste total 30 alumnos")
    void calcularCosteExcursion3() {
        excursion = new Excursion(30);
        assertEquals(2850, excursion.calcularCosteExcursion());
    }

    @Test
    @DisplayName("Coste total 29 alumnos")
    void calcularCosteExcursion4() {
        excursion = new Excursion(29);
        assertEquals(4000, excursion.calcularCosteExcursion());
    }
}