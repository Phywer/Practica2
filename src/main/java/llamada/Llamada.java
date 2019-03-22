package llamada;

import java.time.LocalDate;
import java.util.GregorianCalendar;

public class Llamada {

    private long numTel;
    private LocalDate fecha;
    private int duracion;

    public Llamada(){

    }

    public Llamada(long numTel, int duracion){

        this.numTel = numTel;
        this.duracion = duracion;
        this.fecha = LocalDate.now();

    }

    public LocalDate getFecha(){
        return fecha;
    }

    public long getNumTel() {
        return numTel;
    }

    public int getDuración() {
        return duracion;
    }

}
