package agenda;

import cliente.Cliente;

import java.io.*;
import java.util.List;

public class Agenda implements Serializable {
    private List<Cliente> contactos;
    Agenda agenda;

    public void GuardarCliente (){

        FileOutputStream fos;
        ObjectOutputStream oos;

        try {
            fos =new FileOutputStream("agenda.bin");
            oos =new ObjectOutputStream(fos);
            oos.writeObject(agenda);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
        }

    }

    public void cargarCliente(){
        FileInputStream fis;
        ObjectInputStream ois;

        try{
            fis =new FileInputStream("agenda.bin");
            ois =new ObjectInputStream(fis);
            agenda = (Agenda)ois.readObject();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
