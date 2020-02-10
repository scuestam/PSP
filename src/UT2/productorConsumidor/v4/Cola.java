package UT2.productorConsumidor.v4;

public class Cola {
    private int numero;
    private int turno = 1;
    private boolean disponible = false;//inicialmente cola vacia

    public synchronized int get(int i, int n) {
        while (!disponible || (n != turno)) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        disponible = false;
        if (turno == 1)
            turno = 2;
        else
            turno = 1;


        System.out.println(i + "=>Consumidor: " + n
                + ", consume: " + i);
        notifyAll();
        return numero;
    }


    public synchronized void put(int i, int n) {
        while (disponible || (n != turno)) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        numero = i;
        disponible = true;
        System.out.println(i + "=>Productor : " + n
                + ", produce: " + i);
        notifyAll();
    }

}
