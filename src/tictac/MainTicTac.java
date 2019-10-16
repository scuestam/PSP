package tictac;

public class MainTicTac {
    public static void main(String[] args) {
    Tico tic = new Tico();
    Tac tac = new Tac();
    while(true){
        tic.run();
        tac.run();
    }
}
}
