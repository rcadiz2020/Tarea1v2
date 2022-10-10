
package tarea1;

import java.util.Date;

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

    public String toString(){
        return "Numero: " + numero + "\nRut: " + rut + "\nFecha: " + fecha;
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
