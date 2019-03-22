package cliente;

import excepciones.ClienteNoEncontrado;
import factura.*;
import llamada.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.List;



public class GestorCliente {

    private HashMap<String, Cliente> listaClientes;
    private HashMap<String, Factura> listaFacturas;

    public GestorCliente(){

        listaClientes = new HashMap<String, Cliente>();
        listaFacturas = new HashMap<String, Factura>();

    }

    public boolean contieneCliente(Cliente cliente){

        if(listaClientes.containsKey(cliente.getNif())){
            return true;
        } else {
            return false;
        }
    }

    public boolean contieneLlamada(Llamada llamada, Cliente cliente){

        if(cliente.getListaLlamadas().contains(llamada)){
            return true;
        } else {
            return false;
        }
    }

    public boolean contieneFactura(Factura factura, Cliente cliente){
        if(cliente.getListaFacturas().contains(factura)){
            return true;
        } else {
            return false;
        }
    }

    public void darAlta(Cliente cliente) throws ClienteNoEncontrado{
        if(listaClientes.containsKey(cliente.getNif())){
            throw new ClienteNoEncontrado();
        } else {
            listaClientes.put(cliente.getNif(), cliente);

        }
    }


    public void darBaja(String nif) throws ClienteNoEncontrado{

        if( ! listaClientes.containsKey(nif)){
            throw new ClienteNoEncontrado();
        } else {
            listaClientes.remove(nif);
        }
    }

    public void cambiarTarifa(String nif, int precio) throws ClienteNoEncontrado{
        if ( ! listaClientes.containsKey(nif)){
            throw new ClienteNoEncontrado();
        } else {
            listaClientes.get(nif).setTarifa(new Tarifa(precio));
        }
    }

    public Cliente recuperarDatos(String nif) throws ClienteNoEncontrado{
        if ( ! listaClientes.containsKey(nif)){
            throw new ClienteNoEncontrado();
        } else {
            Cliente cliente = listaClientes.get(nif);
            return cliente;
        }
    }

    public HashMap<String, Cliente> recuperarListado(){
        return listaClientes;
    }

    public void altaLLamada(String nif, Llamada llamada) throws ClienteNoEncontrado{
        if ( ! listaClientes.containsKey(nif)){
            throw new ClienteNoEncontrado();
        } else {
            listaClientes.get(nif).addLlamada(llamada);
        }
    }

    public List<Llamada> listarLlamadas(String nif) throws ClienteNoEncontrado{
        if ( ! listaClientes.containsKey(nif)){
            throw new ClienteNoEncontrado();
        } else {
            return listaClientes.get(nif).getListaLlamadas();
        }
    }

    public void emitirFactura(Cliente cliente, Factura factura) throws ClienteNoEncontrado{
        if ( ! listaClientes.containsKey(cliente.getNif())) {
            throw new ClienteNoEncontrado();
        } else {
            cliente.getListaFacturas().add(factura);
            listaFacturas.put(factura.getCodigo(), factura);
        }
    }

    public Factura recuperarDatosFacturas(String código){
        if( ! listaFacturas.containsKey(código)){
            throw new IllegalArgumentException();
        } else {
            Factura factura = listaFacturas.get(código);
            return factura;
        }
    }

    public List<Factura> listaFacturas(String nif){
        Cliente cliente = listaClientes.get(nif);
        return listaClientes.get(nif).getListaFacturas();
    }


}

