package factura;

public class Tarifa {

    private int céntimos;

    public Tarifa(){

    }

    public Tarifa(int euros){

        this.céntimos = euros;

    }

    public int getPrecio(){

        return céntimos;

    }

}
