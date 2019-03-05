package agenda;

import java.io.*;

public class Agenda implements Serializable {

    public void GuardarCliente (){

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        try {
            fos = new FileOutputStream("agenda.bin");
            oos = new ObjectOutputStream(fos);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
        }
        oos.writeObject(agenda);
        oos.close();
    }

}
