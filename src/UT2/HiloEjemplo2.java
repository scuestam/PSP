package UT2;

public class HiloEjemplo2 extends Thread {
    public void run(){
        System.out.println("\tDentro del  Hilo: "+this.getName());
    }
}
