package makigasJUnit5.catalogo;

import makigasJUnit5.pago.PagoException;
import makigasJUnit5.pago.ProveedorPagos;

public interface Pagable {
    void pagar(ProveedorPagos pagos) throws PagoException;
}
