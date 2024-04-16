package makigasJUnit5.catalogo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    Producto p1;
    Producto p2;
    Pedido pedido;



    @BeforeEach //esto significa "antes de cada uno"
    void setUp() {
         pedido = new Pedido();
        Producto p1 = new Producto("Coco", 400);
        Producto p2 = new Producto("Canela", 200);
    }

    @AfterEach // esto significa "después de cada uno"

    void tearDown() {

        pedido.vaciar();
    }

    @Test
    void agregar() {
    }

    @Test
    @DisplayName("Pedido con 0 productos")
    void testCantidad() {

        // vamos a probar que cuando el pedido está vacío la cantidad que devuelve es 0

        assertEquals(0, pedido.cantidad());
    }

    @Test
    @DisplayName("Pedido con 1 producto")
    void testCantidad2() {

        // para probar el método cantidad necesito un objeto de tipo Pedido con una serie de productos añadidos

        pedido.agregar(p1);
        assertEquals(1, pedido.cantidad());

    }

    @Test
    @DisplayName("Pedido con 2 productos")
    void testCantidad3() {
        // para probar el método cantidad necesito un objeto de tipo Pedido con una serie de productos añadidos


        pedido.agregar(p1);
        pedido.agregar(p2);

        assertEquals(2, pedido.cantidad());

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