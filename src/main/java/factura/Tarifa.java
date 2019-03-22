package factura;

public class Tarifa {

    private int centimos;

    public Tarifa(){
    }

    public Tarifa(int euros){
        this.centimos = euros;
    }

    public int getPrecio(){
        return centimos;
    }

}
