package UT2.pingpong.jorgePing;

public class PingPong extends Thread {

    private String mensaje;
    private static String turno;

    public PingPong (String msg){
        this.mensaje = msg;
    }

    @Override
    public void run() {
        while(true) {
            comanzarJuego();
        }
    }

    public synchronized void comanzarJuego(){
        if (!mensaje.equals(turno)){
            try {
                Thread.currentThread().sleep(1000);
                turno=mensaje;
                System.out.println(mensaje);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}