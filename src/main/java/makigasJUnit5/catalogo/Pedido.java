package makigasJUnit5.catalogo;

import makigasJUnit5.pago.PagoException;
import makigasJUnit5.pago.ProveedorPagos;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Carrito, Pagable{

    private final List<Producto> productos = new ArrayList<>();
    @Override
    public void agregar(Producto p) {
        this.productos.add(p);

    }

    @Override
    public int cantidad() {
        return this.productos.size();
    }

    @Override
    public int total() {
        return this.productos.stream()
                .map(Producto::getPrecio)
                .reduce(0,Integer::sum);
    }

    @Override
    public void vaciar() {
        productos.clear();
    }

    @Override
    public void pagar(ProveedorPagos pagos) throws PagoException {

    }
}
