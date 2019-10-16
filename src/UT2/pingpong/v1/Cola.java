package UT2.pingpong.v1;

public class Cola {
    private boolean disponible = false;//inicialmente cola vacia

    public synchronized String get(int i) {
        while (!disponible) {
            try {
                wait();
            } catch (InterruptedException e) { }
        }
        disponible = false;

        notifyAll();
        return "Ping";
    }


    public synchronized String put(int i) {
        while (disponible){
            try {
                wait();
            } catch (InterruptedException e) { }
        }
        disponible = true;
        notifyAll();
        return "Pong";
    }
}
