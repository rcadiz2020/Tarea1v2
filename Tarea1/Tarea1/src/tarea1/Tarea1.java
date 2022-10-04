package tarea1;

import java.util.ArrayList;
import java.util.Date;

public class Tarea1 {

    public static void main(String[] args) {

        OrdenCompra oc = new OrdenCompra();

        Articulo pera = new Articulo(100, "pera", "se come", 350);
        Articulo manzana = new Articulo(200, "manzana", "se come", 300);
        Articulo platano = new Articulo(300, "platano", "se come", 250);
        Articulo kiwi = new Articulo(400, "kiwi", "se come", 500);
        Articulo durazno = new Articulo(500, "durazno", "se come", 450);

        Cliente cliente1 = new Cliente("Eduardo Arevalo", "20.251.390-5");
        Cliente cliente2 = new Cliente("Jean-Pierre Polnareff", "19.990.160-2");

        Direccion dir = new Direccion("Victor Lamas 1290");

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

}

class Cliente {

    private String nombre;
    private String rut;

    public Cliente(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }
}

class OrdenCompra {

    private Date fecha;
    private String estado;
    public ArrayList<DetalleOrden> compras;

    public OrdenCompra() {
        compras = new ArrayList();

    }

    public void AgregarOrden(Articulo articulo, int item) {
        DetalleOrden DO = new DetalleOrden(articulo, item);
    }

    public float calcPrecio() {
        float variable = 0;
        for (int i = 0; i < compras.size(); i++) {
            variable += compras.get(i).calcPrecio();
        }
        return variable;
    }

    public float calcPrecioSinIVA() {
        float variable = 0;
        for (int i = 0; i < compras.size(); i++) {
            variable += compras.get(i).calcPrecioSinIVA();
        }
        return variable;
    }

    public float calcIVA() {
        return calcPrecio() - calcPrecioSinIVA();
    }

    public float calcPeso() {
        float variable = 0;
        for (int i = 0; i < compras.size(); i++) {
            variable += compras.get(i).calcPeso();

        }
        return variable;
    }

    public float getArticulo(float precio) {
        return precio;
    }

}

class DetalleOrden {

    private int cantidad;
    public Articulo articulo;

    public DetalleOrden(Articulo articulo, int cantidad) {
        this.articulo = articulo;
        this.cantidad = cantidad;
    }

    public float calcPrecio() {
        return cantidad * articulo.getPrecio();
    }

    public float calcPrecioSinIVA() {
        return cantidad * (articulo.getPrecio() * 0.81f);
    }

    public float calcIVA() {
        return cantidad * (articulo.getPrecio() * 0.19f);
    }

    public float calcPeso() {
        return cantidad * articulo.getPeso();
    }
}

class Articulo {

    private float peso;
    private String nombre;
    private String descripcion;
    private float precio;

    public Articulo(float peso, String nombre, String descripcion, float precio) {
        this.peso = peso;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public float getPeso() {
        return peso;
    }

    public float getPrecio() {
        return precio;
    }
}

class Direccion {

    private String direccion;

    public Direccion(String direccion) {
        this.direccion = direccion;
    }
}


class Pago {

    private float monto;
    private Date fecha;

    public Pago(float monto) {
        this.monto = monto;
    }
}

class Tarjeta extends Pago {

    private String tipo;
    private String numTransaccion;

    public Tarjeta(String tipo, String numTransaccion,float monto) {
        super(monto);
        this.tipo = tipo;
        this.numTransaccion = numTransaccion;
    }
}

class Transferencia extends Pago {

    private String banco;
    private String numCuenta;

    public Transferencia(String banco, String numCuenta,float monto) {
        super(monto);
        this.banco = banco;
        this.numCuenta = numCuenta;
    }
}

class Efectivo extends Pago {

    public Efectivo(float monto) {
        super(monto);
    }

    public void calcDevolucion(float costo, float monto) {
        float devolucion;
        devolucion = monto - costo;
    }
}

class DocTributario {

    private String numero;
    private String rut;
    private Date fecha;

    public DocTributario() {
    }
}

class Boleta extends DocTributario {

    public Boleta() {
        super();
    }
}

class Factura extends DocTributario {

    public Factura() {
        super();
    }
}
