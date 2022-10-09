package tarea1;

import java.util.ArrayList;
import java.util.Date;

public class Tarea1 {

    public static void main(String[] args) {

        OrdenCompra oc1 = new OrdenCompra();
        OrdenCompra oc2 = new OrdenCompra();
        OrdenCompra oc3 = new OrdenCompra();

        Articulo pera = new Articulo(100, "pera", "Fruta verde", 350);
        Articulo manzana = new Articulo(200, "manzana", "Fruta roja", 300);
        Articulo platano = new Articulo(300, "platano", "Fruta amarilla", 250);
        Articulo kiwi = new Articulo(400, "kiwi", "Fruta cafe", 500);
        Articulo durazno = new Articulo(500, "durazno", "Fruta naranja", 450);

        Direccion dir = new Direccion("Victor Lamas 1290");
        Direccion dir2 = new Direccion("eloisa urrutia 463");
        Direccion dir3 = new Direccion("Violeta Parra 856");

        Cliente cliente1 = new Cliente("Eduardo", "20.251.390-5", dir);
        Cliente cliente2 = new Cliente("Juan", "19.990.160-2", dir2);
        Cliente cliente3 = new Cliente("Ignacio", "21.365.258-9", dir3);

        oc1.SetCliente(cliente1);
        oc1.AgregarOrden(manzana, 4);
        oc1.AgregarOrden(kiwi, 3);
        oc1.AgregarPago(2500);

        oc2.SetCliente(cliente2);
        oc2.AgregarOrden(platano, 1);
        oc2.AgregarOrden(durazno, 2);
        oc2.AgregarOrden(pera, 6);
        oc2.AgregarOrden(kiwi, 6);
        oc2.AgregarPago(5000);

        oc3.SetCliente(cliente3);
        oc2.AgregarOrden(pera, 6);
        oc2.AgregarOrden(kiwi, 6);
        oc2.AgregarPago(3000);

    

        System.out.println();

    }

}

class Direccion {

    private String direccion;

    public Direccion(String direccion) {
        this.direccion = direccion;
    }

    public String GetDireccion() {
        return direccion;
    }
}

class Cliente {

    private String nombre;
    private String rut;
    private Direccion direccion;

    public Cliente(String nombre, String rut, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
    }

    public String GetNombre() {
        return nombre;
    }

    public String GetRut() {
        return rut;
    }

    public Direccion GetDireccion() {
        return direccion;
    }

}

class OrdenCompra {

    private Date fecha;
    private String estado;
    public ArrayList<DetalleOrden> compras;
    public ArrayList<Pago> pago;
    public Cliente cliente;

    public OrdenCompra() {
        compras = new ArrayList();

    }

    public void AgregarOrden(Articulo articulo, int item) {
        DetalleOrden Do = new DetalleOrden(articulo, item);
        compras.add(Do);
    }

    public void AgregarPago(int saldo) {
        Pago p = new Pago(saldo);
        pago.add(p);
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
        return cantidad * articulo.GetPrecio();
    }

    public float CalcPrecioSinIVA() {
        return cantidad * (articulo.GetPrecio() * 0.81f);
    }

    public float CalcIVA() {
        return cantidad * (articulo.GetPrecio() * 0.19f);
    }

    public float CalcPeso() {
        return cantidad * articulo.GetPeso();
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

    public String getBanco(){
        return banco;
    }

    public String getNumCuenta(){
        return numCuenta;
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
    }

    public String getNumero(){
        return numero;
    }

    public String getRut(){
        return rut;
    }

    public Date getFecha(){
        return fecha;
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
