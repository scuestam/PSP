/* Extendiendo la clase Thread
 *
 * El hilo escribe 5 líneas
 *
 * La función main crea 3 hilos
 */
package UT2;


public class HiloEjemplo01 extends Thread {
    private int c; // contador de cada hilo
    private int hilo;

    // constructor
    public HiloEjemplo01(int hilo) {
        this.hilo = hilo;
        System.out.println("CREANDO HILO:" + hilo);
    }

    // metodo run
    public void run() {
        c = 0;
        while (c <= 5) {
            System.out.println("Hilo:" + hilo + " C = " + c);
            c++;
        }
    }

    // función principal
    public static void main(String[] args) {
        HiloEjemplo01 h = null;
        for (int i = 0; i < 3; i++) {
            h = new HiloEjemplo01(i + 1); // crear hilo
            h.start(); // iniciar hilo
        }
        System.out.println("3 HILOS CREADOS...");
    }
}