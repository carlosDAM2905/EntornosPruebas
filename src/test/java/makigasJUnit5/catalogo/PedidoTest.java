package makigasJUnit5.catalogo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void agregar() {
    }

    @Test
    @DisplayName("Pedido con 0 productos")
    void testCantidad() {

        Pedido p = new Pedido();

        // vamos a probar que cuando el pedido está vacío la cantidad que devuelve es 0

        assertEquals(0, p.cantidad());

    }

    @Test
    @DisplayName("Pedido con 1 producto")
    void testCantidad2() {
        // para probar el método cantidad necesito un objeto de tipo Pedido con una serie de productos añadidos

        Producto p1 = new Producto("Coco", 400);

        Pedido p = new Pedido();


        p.agregar(p1);
        assertEquals(1, p.cantidad());



    }

    @Test
    @DisplayName("Pedido con 2 productos")
    void testCantidad3() {
        // para probar el método cantidad necesito un objeto de tipo Pedido con una serie de productos añadidos

        Producto p1 = new Producto("Coco", 400);
        Producto p2 = new Producto("Canela", 200);
        Pedido p = new Pedido();

        p.agregar(p1);
        p.agregar(p2);

        assertEquals(2, p.cantidad());

    }

    @Test
    void total() {
    }

    @Test
    void vaciar() {
    }

    @Test
    void pagar() {
    }
}