package factura;

import java.time.LocalDate;
import java.util.GregorianCalendar;

public class Factura {

    private String código;
    private LocalDate fechaEmisión;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private float importe;

    private Tarifa tarifa;

    public Factura(){

    }

    public Factura(String código, float importe, Tarifa tarifa, LocalDate fechaInicio, LocalDate fechaFin){

        this.código = código;
        this.fechaEmisión =LocalDate.now();
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.importe = importe;
        this.tarifa = tarifa;
    }

    public LocalDate getFecha(){
        return fechaEmisión;
    }

    public String getCógido(){
        return código;
    }


    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public float getImporte() {
        return importe;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

}
