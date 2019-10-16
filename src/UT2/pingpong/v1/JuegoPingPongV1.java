package UT2.pingpong.v1;

public class JuegoPingPongV1 {
    public static void main(String[] args) {
        Cola cola = new Cola();
        Ping ping = new Ping(cola);
        Pong pong = new Pong(cola);

        ping.start();
        pong.start();
    }
}
