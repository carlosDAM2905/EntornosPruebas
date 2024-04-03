package makigasJUnit5.catalogo;

public class Producto {
    private String nombre;
    private int precio;

    //constructor:


    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //getters y setters:


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    //toString:


    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
