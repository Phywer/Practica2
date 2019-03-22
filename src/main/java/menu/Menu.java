package menu;

public class Menu {

    public enum OpcionesMenu {

        ALTA_CLIENTE("Dar de alta a un cliente."),
        BORRAR_CLIENTE("Borrar un cliente."),
        CAMBIAR_TARIFA("Cambiar su tarifa"),
        DATOS_CLIENTE("Recuperar datos de un cliente."),
        LISTADO_CLIENTES("Listado de todos los clientes."),

        ALTA_LLAMADA("Dar de alta una llamda."),
        LISTAR_LLAMADAS("Listar todas las llamadas de un cliente."),

        EMITIR_FACTURA("Emitir una factura para un cliente."),
        DATOS_FACTURA("Recuperar datos de una factura."),
        LISTAR_FACTURAS("Todas las facturas de un cliente.");

        private String descripción;


        private OpcionesMenu(String descripción) {
            this.descripción = descripción;
        }

        public String getDescripción(){
            return descripción;
        }

        public static OpcionesMenu getOpcion(int posicion){
            return values()[posicion];
        }

        public static String getMenu(){

            StringBuilder sb = new StringBuilder();

            for(OpcionesMenu opcion: OpcionesMenu.values()){

                sb.append(opcion.ordinal());
                sb.append(".- ");
                sb.append(opcion.getDescripción());
                sb.append("\n");
            }
            return sb.toString();
        }
    }
}
