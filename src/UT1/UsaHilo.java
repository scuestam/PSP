package UT1;

public class UsaHilo {
    public static void main(String[] args){
        HiloSimple hs = new HiloSimple();
        hs.start();
        for (int i=0;i<5;i++){
            System.out.print("Fuera del hilo...");
        }
    }
}
class HiloSimple extends Thread{
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("En el hilo...");
        }
    }

}
