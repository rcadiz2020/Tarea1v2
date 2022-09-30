
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

class OrdenCompra extends DetalleOrden {

    private Date fecha;
    private String estado;
    public ArrayList<DetalleOrden> compras;

    public OrdenCompra() {
        compras = new ArrayList();

    }
    public void AgregarOrden(Articulo articulo, int item){
        DetalleOrden DO = new DetalleOrden(articulo,item);
    }

    public void calcPrecio() {
        /* for(int i; i < compras.size; i++){
            variable += copmras.calcPrecio;
            return variable;
        } */
    }

    public void calcPrecioSinIVA() {
       /* for(int i; i < compras.size; i++){
            variable += copmras.calcPrecioSinIVA;
            return variable;
        } */
    }

    public void calcIVA() {
       /* for(int i; i < compras.size; i++){
            variable += copmras.calcIVA;
            return variable;
        } */
    }

    public void calcPeso() {
       /* for(int i; i < compras.size; i++){
            variable += copmras.calcPeso;
            return variable;
        } */        
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
        return cantidad * getPrecio;//precioarticulo//;
    }

    public float calcPrecioSinIVA() {
        return cantidad * (getPrecio * 0.81);//precioarticulo*0.81//;
    }

    public float calcIVA() {
        return cantidad * (getPrecio * 0.19);//precioarticulo*0.19//;
    }

    public int calcPeso() {
        return cantidad * getPeso;//pesoarticulo//;
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

    public float getPeso(){
        return peso;
    }

    public float getPrecio(){
        return precio;
    }
}

class Direccion {

    private String direccion;

    public Direccion(String direccion) {
        this.direccion = direccion;
    }
}
////////////////////////////////////////////////7

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

    public Tarjeta(String tipo, String numTransaccion) {
        super();
        this.tipo = tipo;
        this.numTransaccion = numTransaccion;
    }
}

class Transferencia extends Pago {

    private String banco;
    private String numCuenta;

    public Transferencia(String banco, String numCuenta) {
        super();
        this.banco = banco;
        this.numCuenta = numCuenta;
    }
}

class Efectivo extends Pago {

    public Efectivo(float monto) {
        super();
    }

    public void calcDevolucion(float costo) {
        float devolucion = 0;
        devolucion = monto - super()costo;
    }
}
/////////////////////////////////////////

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
