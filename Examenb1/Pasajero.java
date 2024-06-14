package Examenb1;

public class Pasajero {

    private String nombre;

    public Pasajero(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }
    String cliente=getNombre();

    public void mostrarInfo(){
        System.out.println("Pasajero: "+cliente);
    }



}
