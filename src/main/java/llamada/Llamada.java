package llamada;

import java.time.LocalDate;
import java.util.GregorianCalendar;

public class Llamada {

    private long numTel;
    private LocalDate fecha;
    private int duración;

    public Llamada(){

    }

    public Llamada(long numTel, int duración){

        this.numTel = numTel;
        this.duración = duración;
        this.fecha = LocalDate.now();

    }

    public LocalDate getFecha(){
        return fecha;
    }

    public long getNumTel() {
        return numTel;
    }

    public int getDuración() {
        return duración;
    }

}
