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

        oc1.setCliente(cliente1);
        oc1.AgregarOrden(manzana, 4);
        oc1.AgregarOrden(kiwi, 3);
        Efectivo efectivo1 = new Efectivo(2500);

        oc2.setCliente(cliente2);
        oc2.AgregarOrden(platano, 1);
        oc2.AgregarOrden(durazno, 2);
        oc2.AgregarOrden(pera, 6);
        oc2.AgregarOrden(kiwi, 6);
        Tarjeta tarjeta1 = new Tarjeta("debito", "1254635", 6250);

        oc3.setCliente(cliente3);
        oc3.AgregarOrden(pera, 6);
        oc3.AgregarOrden(kiwi, 6);
        Transferencia transf1 = new Transferencia("Estado", "254639578", 5100);

        System.out.println(oc1.getFecha());
        System.out.println("Cliente: " + oc1.getCliente());
        System.out.println("Sin IVA: $" + oc1.CalcPrecioSinIVA());
        System.out.println("IVA: $:" + oc1.CalcIVA());
        System.out.println("Total: $" + oc1.CalcPrecio());
        System.out.println("Peso:" + oc1.CalcPeso() + " gramos");

        System.out.println(oc2.getFecha());
        System.out.println("Cliente: " + oc2.getCliente());
        System.out.println("Sin IVA: $" + oc2.CalcPrecioSinIVA());
        System.out.println("IVA: $:" + oc2.CalcIVA());
        System.out.println("Total: $" + oc2.CalcPrecio());
        System.out.println("Peso:" + oc2.CalcPeso() + " gramos");

        System.out.println(oc3.getFecha());
        System.out.println("Cliente: " + oc3.getCliente());
        System.out.println("Sin IVA: $" + oc3.CalcPrecioSinIVA());
        System.out.println("IVA: $:" + oc3.CalcIVA());
        System.out.println("Total: $" + oc3.CalcPrecio());
        System.out.println("Peso:" + oc3.CalcPeso() + " gramos");
    }

}

