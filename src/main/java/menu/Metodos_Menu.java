package menu;

import cliente.*;
import excepciones.ClienteNoEncontrado;
import factura.Tarifa;
import llamada.Llamada;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Metodos_Menu {

    GestorCliente gestorCliente= new GestorCliente();

    public void darAltaCliente() throws ClienteNoEncontrado {

        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Es una empresa o un particular (E/P) ?");
        String tipo = entrada.next();

        System.out.println("Escriba su nombre: ");
        String nombre = entrada.next();

        System.out.println("Escriba su DNI: ");
        String nif = entrada.next();

        System.out.println("Escriba el código postal: ");
        int CPostal = entrada.nextInt();

        System.out.println("Escriba la provincia: ");
        String provincia = entrada.next();

        System.out.println("Escriba la población: ");
        String poblacion = entrada.next();


        System.out.println("Escriba su tarifa: ");
        int tarifa = entrada.nextInt();

        System.out.println("Escriba su correo: ");
        String correo = entrada.next();

        Direccion direccion = new Direccion(CPostal, provincia, poblacion);
        Tarifa nueva_tarifa = new Tarifa(tarifa);

        if(tipo.equals("P")){
            System.out.println("Escriba sus apellidos: ");
            String apellidos = entrada.next();

            Cliente cliente = new Particular(nombre, apellidos, nif, correo, nueva_tarifa, direccion);
            GestorCliente.darAlta(cliente);

        } else {
            Cliente cliente = new Empresa(nombre, nif, correo, nueva_tarifa, direccion);
            GestorCliente.darAlta(cliente);
        }
    }

    public void darBajaCliente() throws ClienteNoEncontrado{
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba su DNI: ");
        String nif = entrada.next();
        GestorCliente.darBaja(nif);
    }

    public void cambiarTarifa() throws ClienteNoEncontrado{
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba su DNI: ");
        String nif = entrada.next();
        System.out.println("Escriba su tarifa: ");
        int tarifa = entrada.nextInt();
        GestorCliente.cambiarTarifa(nif, tarifa);
    }

    public void datosCliente() throws ClienteNoEncontrado{
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba su DNI: ");
        String nif = entrada.next();
        System.out.println("¿Es un particular o una empresa ?: ");
        String tipo = entrada.next();
        GestorCliente.recuperarDatos(nif);
    }

    public void listarClientes(){
        GestorCliente.recuperarListado();
    }

    public void altaLLamada() throws ClienteNoEncontrado{
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba su DNI: ");
        String nif = entrada.next();
        System.out.println("Escriba el número de teléfono al que ha llamado: ");
        long num_tel = entrada.nextLong();
        System.out.println("Escriba la duracion de la llamada realizada: ");
        int duracion = entrada.nextInt();
        Llamada llamada = new Llamada(num_tel, duracion);
        GestorCliente.altaLLamada(nif, llamada);
    }

    public void listaLlamada() throws ClienteNoEncontrado{
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba su DNI: ");
        String nif = entrada.next();
        GestorCliente.listarLlamadas(nif);
    }

    public void emitirFactura(){
        GregorianCalendar fechaInicio = new GregorianCalendar();
        GregorianCalendar fechaFin = new GregorianCalendar();

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba su DNI: ");
        String nif = entrada.next();

        System.out.println("Escriba el codigo de la factura: ");
        String codigo = entrada.next();

        System.out.println("Escriba a partir de que día quiere que le emitamos su factura: ");
        int dia = entrada.nextInt();

        System.out.println("Escriba a partir de que mes quiere que le emitamos su factura: ");
        int mes = entrada.nextInt();

        System.out.println("Escriba a partir de que año quiere que le emitamos su factura: ");
        int año = entrada.nextInt();

        fechaInicio.set(dia, mes, año);
        fechaFin.set(dia, mes+1, año);
    }

    public void datosFactura(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba el codigo de la factura: ");
        String codigo = entrada.next();

        GestorCliente.recuperarDatosFacturas(codigo);
    }

    public void listaFacturas(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba su DNI: ");
        String nif = entrada.next();

        GestorCliente.listaFacturas(nif);
    }
}
