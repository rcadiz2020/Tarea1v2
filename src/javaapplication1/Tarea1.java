import java.util.Date;

public class Tarea1 {

    public static void main(String[] args) {

    }

}

class Cliente{
    private String nombre;
    private String rut; 
    public Cliente(){

    }
}

class OrdenCompra extends DetalleOrden{
    private Date fecha;
    private String estado;
    public OrdenCompra(){

    }

}

class DetalleOrden{
    private int cantidad;
    public DetalleOrden(){

    }
    public void calcPrecioSinIVA(){

    }
    public void calcIVA(){

    }
    public void calcPrecio(){

    }
    public void calcPeso(){

    }
}

class Articulo{
    private float peso;
    private String nombre;
    private String descripcion;
    private float precio;
    public Articulo(){

    }
}

class Direccion{
    private String direccion;
    public Direccion(){

    }
}

class Pago{
    private float monto;
    private Date fecha;
    public Pago(){

    }
}

class Tarjeta{
    private String tipo;
    private String numTransaccion;
    public Tarjeta(){

    }
}

class Transferencia{
    private String banco;
    private String numCuenta;
    public Transferencia(){

    }
}

class Efectivo{
    public void calcDevolucion(){

    }
    public Efectivo(){

    }
}

class Boleta{
    public Boleta(){

    }
}

class Factura{
    public Factura(){

    }
}

class DocTributario{
    private String numero;
    private String rut;
    private Date fecha;
    public DocTributario(){
        
    }
}