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

        Cliente cliente1 = new Cliente("Eduardo", "20.251.390-5");
        Cliente cliente2 = new Cliente("Juan", "19.990.160-2");

        Direccion dir = new Direccion("Victor Lamas 1290");
        Direccion dir2 = new Direccion("eloisa urrutia 463");
        
        oc.SetCliente(cliente1);
        oc.AgregarOrden(manzana, 4);
        oc.AgregarOrden(kiwi, 3);

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
    private Direccion direccion;
    
    public Cliente(String nombre, String rut,Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
    }
    public String GetNombre(){
        return nombre;
    }
    public String GetRut(){
        return rut;
    }
    public Direccion GetDireccion(){
        return direccion;
    }
    
}
class Direccion {

    private String direccion;

    public Direccion(String direccion) {
        this.direccion = direccion;
    }
    public String GetDireccion(){
        return direccion;
    }
}

class OrdenCompra {

    private Date fecha;
    private String estado;
    public ArrayList<DetalleOrden> compras;
    public Cliente cliente; 

    public OrdenCompra() {
        compras = new ArrayList();

    }

    public void AgregarOrden(Articulo articulo, int item) {
        DetalleOrden Do = new DetalleOrden(articulo, item);
        compras.add(Do);
    }

    public float CalcPrecio() {
        float variable = 0;
        for (int i = 0; i < compras.size(); i++) {
            variable += compras.get(i).calcPrecio();
        }
        return variable;
    }

    public float CalcPrecioSinIVA() {
        float variable = 0;
        for (int i = 0; i < compras.size(); i++) {
            variable += compras.get(i).calcPrecioSinIVA();
        }
        return variable;
    }

    public float CalcIVA() {
        return calcPrecio() - calcPrecioSinIVA();
    }

    public float CalcPeso() {
        float variable = 0;
        for (int i = 0; i < compras.size(); i++) {
            variable += compras.get(i).calcPeso();

        }
        return variable;
    }

    public float CetArticulo(float precio) {
        return precio;
    }

    public void SetCliente(Cliente c) {
        this.cliente = c;
        
    }

    public Cliente GetCliente() {
        return cliente;
    }

}

class DetalleOrden {

    private int cantidad;
    public Articulo articulo;

    public DetalleOrden(Articulo articulo, int cantidad) {
        this.articulo = articulo;
        this.cantidad = cantidad;
    }

    public float CalcPrecio() {
        return cantidad * articulo.getPrecio();
    }

    public float CalcPrecioSinIVA() {
        return cantidad * (articulo.getPrecio() * 0.81f);
    }

    public float CalcIVA() {
        return cantidad * (articulo.getPrecio() * 0.19f);
    }

    public float CalcPeso() {
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

    public float GetPeso() {
        return peso;
    }

    public float GetPrecio() {
        return precio;
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

    public Tarjeta(String tipo, String numTransaccion, float monto) {
        super(monto);
        this.tipo = tipo;
        this.numTransaccion = numTransaccion;
    }
}

class Transferencia extends Pago {

    private String banco;
    private String numCuenta;

    public Transferencia(String banco, String numCuenta, float monto) {
        super(monto);
        this.banco = banco;
        this.numCuenta = numCuenta;
    }
}

class Efectivo extends Pago {

    public Efectivo(float monto) {
        super(monto);
    }

    public void CalcDevolucion(float costo, float monto) {
        float devolucion;
        devolucion = monto - costo;
    }
}

class DocTributario {

    private String numero;
    private String rut;
    private Date fecha;

    public DocTributario(String numero, String rut) {

        this.numero = numero;
        this.rut = rut;
        this.fecha = new Date();
        System.out.println(this.fecha);
    }
}

class Boleta extends DocTributario {

    public Boleta(String numero, String rut) {
        super(numero, rut);
    }
}

class Factura extends DocTributario {

    public Factura(String numero, String rut) {
        super(numero, rut);
    }
}
