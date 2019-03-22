import java.util.Scanner;
import cliente.GestorCliente;
import excepciones.ClienteNoEncontrado;
import menu.*;

public class Main {

    public static void main(String[] args) throws ClienteNoEncontrado {

        Metodos_Menu metodos = new Metodos_Menu();
        System.out.println(Menu.OpcionesMenu.getMenu());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige una opción: ");
        byte opcion = scanner.nextByte();

        Menu.OpcionesMenu opcionMenu = Menu.OpcionesMenu.getOpcion(opcion);

        switch (opcionMenu) {

            case ALTA_CLIENTE:
                metodos.darAltaCliente();
                break;

            case BORRAR_CLIENTE:
                metodos.darBajaCliente();
                break;

            case CAMBIAR_TARIFA:
                metodos.cambiarTarifa();
                break;

            case DATOS_CLIENTE:
                metodos.datosCliente();
                break;

            case LISTADO_CLIENTES:
                metodos.listarClientes();
                break;

            case ALTA_LLAMADA:
                metodos.altaLLamada();
                break;

            case LISTAR_LLAMADAS:
                metodos.listaLlamada();
                break;

            case EMITIR_FACTURA:
                metodos.emitirFactura();
                break;

            case DATOS_FACTURA:
                metodos.datosFactura();
                break;

            case LISTAR_FACTURAS:
                metodos.listaFacturas();
                break;
        }
    }
}
