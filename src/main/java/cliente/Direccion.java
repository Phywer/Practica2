package cliente;

public class Direccion {

    private int códigoPostal;
    private String provincia;
    private String población;

    public Direccion(int códigoPostal, String provincia, String población) {

        this.códigoPostal = códigoPostal;
        this.provincia = provincia;
        this.población = población;
    }

    public Direccion(){
    }

}
