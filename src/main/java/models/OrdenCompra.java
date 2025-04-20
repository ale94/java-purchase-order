package models;

import java.util.Date;

public class OrdenCompra {

    private int id;
    private final String descripcion;
    private Date fecha;
    private Cliente cliente;
    private final Producto[] productos;
    private int indice;
    private static int contadorId = 0;

    public OrdenCompra(String descripcion) {
        this.id = ++contadorId;
        this.productos = new Producto[4];
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void addProducto(Producto producto) {
        if (indice < this.productos.length) {
            this.productos[indice++] = producto;
        }
    }

    public int getGranTotal() {
        int total = 0;
        for (int i = 0; i < this.productos.length; i++) {
            total += this.productos[i].getPrecio();
        }
        return total;
    }
}
