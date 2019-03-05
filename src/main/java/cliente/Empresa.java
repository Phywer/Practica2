package cliente;

import factura.Tarifa;

public class Empresa extends Cliente{

    public Empresa(){
    }

    public Empresa(String nombre, String nif, String correo, Tarifa tarifa, Dirección dirección){
        super(nombre, nif, correo, tarifa, dirección);
    }

}
