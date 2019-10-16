package UT2.pingpong.v1;

public class Ping extends Thread {
    private Cola cola;

    public Ping(Cola c) {
        cola = c;
    }

    public void run() {
        String valor ="";
        for (int i = 0; i < 5; i++) {
            valor = cola.put(i); //pone el n�mero

            try {
                sleep(1000);
            } catch (InterruptedException e) { }
            System.out.println(valor);
        }
    }
}
