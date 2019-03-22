package cliente;

import factura.*;

public class Particular extends Cliente {

    private String apellidos;

    public Particular(String nombre, String apellidos, String nif, String correo, Tarifa tarifa, Direccion direccion){
        super(nombre, nif, correo, tarifa, direccion);
        this.apellidos = apellidos;
    }

    public Particular(){
    }


    public String getApellidos() {
        return apellidos;
    }

}
