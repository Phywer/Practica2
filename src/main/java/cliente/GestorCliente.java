package cliente;

import excepciones.ClienteNoEncontrado;
import factura.*;
import llamada.*;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;



public class GestorCliente {

    private static HashMap<String, Cliente> listaClientes;
    private static HashMap<String, Factura> listaFacturas;

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

    public static void darAlta(Cliente cliente) throws ClienteNoEncontrado{

        if(! listaClientes.containsKey(cliente.getNif())){



            listaClientes.put(cliente.getNif(), cliente);

        } else {

            throw new ClienteNoEncontrado();

        }

    }

    public static void darBaja(String nif) throws ClienteNoEncontrado{

        if( ! listaClientes.containsKey(nif)){

            throw new ClienteNoEncontrado();


        } else {

            listaClientes.remove(nif);

        }

    }

    public static void cambiarTarifa(String nif, int precio) throws ClienteNoEncontrado{

        if ( ! listaClientes.containsKey(nif)){

            throw new ClienteNoEncontrado();

        } else {

            listaClientes.get(nif).setTarifa(new Tarifa(precio));

        }

    }

    public static Cliente recuperarDatos(String nif) throws ClienteNoEncontrado{

        if ( ! listaClientes.containsKey(nif)){

            throw new ClienteNoEncontrado();

        } else {

            Cliente cliente = listaClientes.get(nif);

            return cliente;
        }
    }

    public static HashMap<String, Cliente> recuperarListado(){

        return listaClientes;

    }

    public static void altaLLamada(String nif, Llamada llamada) throws ClienteNoEncontrado{

        if ( ! listaClientes.containsKey(nif)){

            throw new ClienteNoEncontrado();

        } else {

            listaClientes.get(nif).addLlamada(llamada);

        }

    }

    public static List<Llamada> listarLlamadas(String nif) throws ClienteNoEncontrado{

        if ( ! listaClientes.containsKey(nif)){

            throw new ClienteNoEncontrado();

        } else {

            return listaClientes.get(nif).getListaLlamadas();

        }


    }

    public static void emitirFactura(Cliente cliente, Factura factura) throws ClienteNoEncontrado{

        if ( ! listaClientes.containsKey(cliente.getNif())) {

            throw new ClienteNoEncontrado();

        } else {

            cliente.getListaFacturas().add(factura);
            listaFacturas.put(factura.getCógido(), factura);


        }

    }

    public static Factura recuperarDatosFacturas(String código){

        if( ! listaFacturas.containsKey(código)){

            throw new IllegalArgumentException();

        } else {

            Factura factura = listaFacturas.get(código);

            return factura;

        }


    }

    public static List<Factura> listaFacturas(String nif){

        Cliente cliente = listaClientes.get(nif);

        return listaClientes.get(nif).getListaFacturas();


    }

}

