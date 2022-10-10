package tarea1;

import java.util.Date;

class Pago {

    private float monto;
    private Date fecha;

    public Pago(float monto) {
        this.monto = monto;
    }

    public void AgregarPago(int saldo) {
        monto = monto + saldo;
    }

    public Date fechapago() {
        return fecha;
    }

    public String toString() {
        return "$" + monto + "\nFecha: " + fecha;
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

    public String getTipo() {
        return tipo;
    }

    public String getNumTransaccion() {
        return numTransaccion;
    }

    public String toString() {
        return "Tipo: " + "\nNumero de Transaccion: " + numTransaccion;
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

    public String getBanco() {
        return banco;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public String toString() {
        return "Banco: " + banco + "\nNumero de cuenta: " + numCuenta;
    }
}

class Efectivo extends Pago {

    private float devolucion;

    public Efectivo(float monto) {
        super(monto);
    }

    public void CalcDevolucion(float costo, float monto) {
        devolucion = monto - costo;
    }

    public String toString() {
        return "Devolucion: " + devolucion;
    }
}
