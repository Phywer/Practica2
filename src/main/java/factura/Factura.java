package factura;

import java.util.GregorianCalendar;

public class Factura {

    private String código;
    private GregorianCalendar fechaEmisión;
    private GregorianCalendar fechaInicio;
    private GregorianCalendar fechaFin;
    private float importe;

    private Tarifa tarifa;

    public Factura(){

    }

    public Factura(String código, float importe, Tarifa tarifa, GregorianCalendar fechaInicio, GregorianCalendar fechaFin){

        this.código = código;
        this.fechaEmisión = new GregorianCalendar();
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.importe = importe;
        this.tarifa = tarifa;

    }

    public GregorianCalendar getFecha(){

        return fechaEmisión;

    }

    public String getCógido(){

        return código;

    }


    public GregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    public GregorianCalendar getFechaFin() {
        return fechaFin;
    }

    public float getImporte() {
        return importe;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

}
