package Examenb1;

public class Ticket extends Servicio{
    String codigo;
    public Ticket(String cliente,double rutaQG,double rutaQT,double rutaQP, double rutaQR, double recargo,double costoAdd, String codigo){
        super(cliente, rutaQG, rutaQT, rutaQP, rutaQR, recargo,costoAdd);
        this.codigo=codigo;
    }

    double vipg;
    double vipt;
    double vipp;
    double vipr;

    public void calcularcosto(){
        double vipg= rutaQG+(rutaQG*recargo)+costoAdd;
        double vipt= rutaQT+(rutaQT*recargo)+costoAdd;
        double vipp= rutaQP+(rutaQP*recargo)+costoAdd;
        double vipr= rutaQR+(rutaQR*recargo)+costoAdd;
        System.out.print("\n-----------\nNombre: "+cliente+"\nRuta QUITO GUAYAQUIL: "+rutaQG+"\nRuta: QUITO TULCAN"+rutaQT+"\nRuta: QUITO RIOBAMBA"+rutaQR+"\nRuta: QUITO PUYO"+rutaQP+"\nRecargo VIP: "+recargo+"\nRecargo Servicio extra: "+costoAdd+"\nCodigo Ticket: "+codigo+"\nTotal: "+vipg);


    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.print("\nNombre: "+cliente+"\nRuta: "+rutaQG+"\nRecargo VIP: "+recargo+"\nRecargo Servicio extra: "+costoAdd+"\nCodigo Ticket: "+codigo+"\nTotal: "+vipg);
        System.out.print("\nNombre: "+cliente+"\nRuta: "+rutaQT+"\nRecargo VIP: "+recargo+"\nRecargo Servicio extra: "+costoAdd+"\nCodigo Ticket: "+codigo+"\nTotal: "+vipt);
        System.out.print("\nNombre: "+cliente+"\nRuta: "+rutaQP+"\nRecargo VIP: "+recargo+"\nRecargo Servicio extra: "+costoAdd+"\nCodigo Ticket: "+codigo+"\nTotal: "+vipp);
        System.out.print("\nNombre: "+cliente+"\nRuta: "+rutaQR+"\nRecargo VIP: "+recargo+"\nRecargo Servicio extra: "+costoAdd+"\nCodigo Ticket: "+codigo+"\nTotal: "+vipr);
    }
}
