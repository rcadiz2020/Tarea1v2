
package tarea1;

class Cliente {

    private String nombre;
    private String rut;
    private Direccion direccion;

    public Cliente(String nombre, String rut, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public String toString(){
        return "Nombre: " + nombre + "\nRut: " + rut + "\nDireccion: " + direccion;
    }

}

