
package tarea1;


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

    public String toString(){
        return articulo.toString() + " Cantidad:" + cantidad;
    }
}

