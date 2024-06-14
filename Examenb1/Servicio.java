package Examenb1;

public class Servicio extends VIP{
    public double costoAdd;
    public Servicio(String cliente,double rutaQG,double rutaQT,double rutaQP, double rutaQR, double recargo, double costoAdd){
        super(cliente, rutaQG, rutaQP, rutaQT, rutaQR, recargo);
        this.costoAdd=3.00;
    }


    public void mostrarInfo(){
        System.out.print("Recargo adicional por servicio extra: "+costoAdd);
    }

}
