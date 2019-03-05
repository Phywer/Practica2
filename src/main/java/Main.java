import java.util.Scanner;

import excepciones.ClienteNoEncontrado;
import menú.*;

public class Main {

    public static void main(String[] args) throws ClienteNoEncontrado {

        System.out.println(Menú.OpcionesMenu.getMenu());

        Scanner opcion = new Scanner(System.in);
        System.out.println("Elige una opción: ");
        byte opción = opcion.nextByte();

        Menú.OpcionesMenu opcionMenu = Menú.OpcionesMenu.getOpcion(opción);

        switch (opcionMenu) {

            case ALTA_CLIENTE:
                Métodos_Menú.darAltaCliente();
                break;

            case BORRAR_CLIENTE:
                Métodos_Menú.darBajaCliente();
                break;

            case CAMBIAR_TARIFA:
                Métodos_Menú.cambiarTarifa();
                break;

            case DATOS_CLIENTE:
                Métodos_Menú.datosCliente();
                break;

            case LISTADO_CLIENTES:
                Métodos_Menú.listarClientes();
                break;

            case ALTA_LLAMADA:
                Métodos_Menú.altaLLamada();
                break;

            case LISTAR_LLAMADAS:
                Métodos_Menú.listaLlamada();
                break;

            case EMITIR_FACTURA:
                Métodos_Menú.emitirFactura();
                break;

            case DATOS_FACTURA:
                Métodos_Menú.datosFactura();
                break;

            case LISTAR_FACTURAS:
                Métodos_Menú.listaFacturas();
                break;

        }
    }

}
