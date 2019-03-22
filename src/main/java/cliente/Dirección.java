package cliente;

public class Dirección {

    private int códigoPostal;
    private String provincia;
    private String población;

    public Dirección(int códigoPostal, String provincia, String población) {

        this.códigoPostal = códigoPostal;
        this.provincia = provincia;
        this.población = población;
    }

    public Dirección(){
    }

}
