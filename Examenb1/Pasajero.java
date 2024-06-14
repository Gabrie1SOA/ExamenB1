package Examenb1;

public class Pasajero {

    private String nombre;

    public Pasajero(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    String cliente=getNombre();
    public void mostrarInfo(){
        System.out.println("Pasajero: "+cliente);
    }


}
