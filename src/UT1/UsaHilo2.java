package UT1;

public class UsaHilo2 {
    public static void main(String[] args) {
        HiloSimple2 hs = new HiloSimple2();
        Thread t = new Thread((Runnable) hs);
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Fuera del hilo...");
        }
    }
}

class HiloSimple2 {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("En el hilo...");
        }
    }
}
