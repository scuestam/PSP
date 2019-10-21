package UT2.pingpong.jorgePing;

public class Main {

    public static void main(String[] args) {

        PingPong ping = new PingPong("PING");
        PingPong pong = new PingPong("PONG");

        ping.start();
        pong.start();
    }
}