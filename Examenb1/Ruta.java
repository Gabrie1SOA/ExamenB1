package Examenb1;

public class Ruta extends Pasajero{
    double rutaQG;
    double rutaQP;
    double rutaQT;
    double rutaQR;

    public Ruta(String cliente, double rutaQG, double rutaQP, double rutaQT, double rutaQR){
        super(cliente);

        this.rutaQG=rutaQG;
        this.rutaQP=rutaQP;
        this.rutaQT=rutaQT;
        this.rutaQR=rutaQR;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("\nPrecio ruta Quito-Guayaquil: "+rutaQG+"\nPrecio ruta Quito-Puyo: "+rutaQP+"\nPrecio ruta Quito-Tulcán: "+rutaQT+"\nPrecio ruta Quito-Riobamba: "+rutaQR);
    }

}
