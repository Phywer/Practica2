package factura;

import java.time.LocalDate;
import java.util.GregorianCalendar;

public class Factura {

    private String codigo;
    private LocalDate fechaEmision;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private float importe;

    private Tarifa tarifa;

    public Factura(){

    }

    public Factura(String codigo, float importe, Tarifa tarifa, LocalDate fechaInicio, LocalDate fechaFin){

        this.codigo = codigo;
        this.fechaEmision =LocalDate.now();
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.importe = importe;
        this.tarifa = tarifa;
    }

    public LocalDate getFecha(){
        return fechaEmision;
    }

    public String getCodigo(){
        return codigo;
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
