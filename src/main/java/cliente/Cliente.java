package cliente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import factura.*;
import llamada.*;

public abstract class Cliente {

    private String nombre;
    private String nif;
    private String correo;
    private LocalDate fecha_alta;

    private List<Llamada> listaLlamadas;
    private List<Factura> listaFacturas;


    private Tarifa tarifa;
    private Direccion direccion;
    private Particular particular;
    //private Empresa empresa;

    public Cliente(){

    }

    public Cliente(String nombre, String nif, String correo, Tarifa tarifa, Direccion direccion){

        this.nombre = nombre;
        this.nif = nif;
        this.correo = correo;
        this.tarifa = tarifa;
        this.direccion = direccion;
        this.fecha_alta = LocalDate.now();
        this.listaLlamadas = new ArrayList<Llamada>();
        this.listaFacturas = new ArrayList<Factura>();
    }

    public LocalDate getFecha(){
        return fecha_alta;

    }

    public Tarifa getTarifa(){
        return tarifa;
    }

    public void addLlamada(Llamada llamada){
        this.listaLlamadas.add(llamada);
    }

    public void addFactura(Factura factura){
        this.listaFacturas.add(factura);
    }

    public String getNif(){
        return nif;
    }

    public void setTarifa(Tarifa precio){
        this.tarifa = precio;
    }

    public String getNombre(){
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public List<Llamada> getListaLlamadas() {
        return listaLlamadas;
    }

    public List<Factura> getListaFacturas() {
        return listaFacturas;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Particular getParticular() {
        return particular;
    }

}
