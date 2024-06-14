package Examenb1;

public class Main {
    public static void main(String[] args) {

        Ticket tk1=new Ticket("Juan",20.00,0,0,0,0.3,3,"123456");
        Ticket tk2=new Ticket("Pedro",0,0,15,17.50,0.3,3,"123456");
        Ticket tk3=new Ticket("Pepe",0,17.50,0,17.50,0.3,0,"123456");
        Ticket tk4=new Ticket("Jose",20.00,17.50,15,17.50,0,3,"123456");
        Ticket tk5=new Ticket("Maria",20.00,17.50,15,17.50,0.3,0,"123456");
        Ticket tk6=new Ticket("Daniel",20.00,17.50,15,17.50,0,3,"123456");
        tk1.calcularcosto();
        tk2.calcularcosto();
        tk3.calcularcosto();
        tk4.calcularcosto();
        tk5.calcularcosto();
        tk6.calcularcosto();

    }
}