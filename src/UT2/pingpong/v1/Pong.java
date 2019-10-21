package UT2.pingpong.v1;

public class Pong extends Thread {
        private Cola cola;

        public Pong(Cola c) {
            cola = c;
        }

        public void run() {
            int n = 0;
            String valor = "";
            for (int i = 0; i < 5; i++) {
                valor = cola.get(i); //recoge el n�mero
                try {
                    sleep(1000);
                } catch (InterruptedException e) { }
                System.out.println(valor);
            }
        }
}
