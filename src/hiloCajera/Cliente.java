package hiloCajera;

public class Cliente {
    private String nombre;
    private int[] carroCompra;

    //CONSTRUCTOR
    public Cliente (String nombre, int[] carroCompra){
        this.nombre = nombre;
        this.carroCompra = carroCompra;
    }
    //VOID CONSTRUCTOR
    public Cliente(){

    }
    //GETTER AND SETTERS
    public String getNombre(){
        return this.nombre;
    }
    public int[] getCarroCompra(){
        return carroCompra;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCarroCompra(int[] carroCompra){
        this.carroCompra = carroCompra;
    }

}
