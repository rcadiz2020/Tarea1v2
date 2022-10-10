
package tarea1;

import java.util.ArrayList;
import java.util.Date;

class OrdenCompra {

    private Date fecha;
    private String estado;
    public ArrayList<DetalleOrden> compras;
    public Cliente cliente;

    public OrdenCompra() {
        compras = new ArrayList();
        fecha = new Date();

    }

    public void AgregarOrden(Articulo articulo, int item) {
        DetalleOrden Do = new DetalleOrden(articulo, item);
        compras.add(Do);
    }


    public float CalcPrecio() {
        float precio = 0;
        for (int i = 0; i < compras.size(); i++) {
            precio += compras.get(i).CalcPrecio();
        }
        return precio;
    }

    public float CalcPrecioSinIVA() {
        float precio = 0;
        for (int i = 0; i < compras.size(); i++) {
            precio += compras.get(i).CalcPrecioSinIVA();
        }
        return precio;
    }

    public float CalcIVA() {
        return CalcPrecio() - CalcPrecioSinIVA();
    }

    public float CalcPeso() {
        float peso = 0;
        for (int i = 0; i < compras.size(); i++) {
            peso += compras.get(i).CalcPeso();

        }
        return peso;
    }

    public float setArticulo(float precio) {
        return precio;
    }

    public void setCliente(Cliente c) {
        this.cliente = c;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Date getFecha(){
        return fecha;
    }

    public String toString(){
        return "Fecha: " + fecha + "\nEstado: " + "\nDetalle: " + compras;
    }

}


