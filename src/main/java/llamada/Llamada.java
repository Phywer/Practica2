package llamada;

import java.util.GregorianCalendar;

public class Llamada {

    private long numTel;
    private GregorianCalendar fecha;
    private int duración;

    public Llamada(){

    }

    public Llamada(long numTel, int duración){

        this.numTel = numTel;
        this.duración = duración;
        this.fecha = new GregorianCalendar();

    }

    public GregorianCalendar getFecha(){

        return fecha;

    }

    public long getNumTel() {
        return numTel;
    }

    public int getDuración() {
        return duración;
    }

}
