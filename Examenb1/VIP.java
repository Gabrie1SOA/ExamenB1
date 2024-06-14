package Examenb1;

public class VIP extends Ruta{
    public double recargo;

    public VIP(String cliente,double rutaQG,double rutaQT,double rutaQP, double rutaQR, double recargo){
        super(cliente, rutaQG, rutaQP, rutaQT, rutaQR);
        this.recargo=recargo;
    }

    @Override
    public void mostrarInfo() {
        System.out.print("Recargo adicional VIP: "+recargo);
    }
}
