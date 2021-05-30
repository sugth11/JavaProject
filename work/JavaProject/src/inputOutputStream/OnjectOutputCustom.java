package inputOutputStream;

import java.io.*;

public class OnjectOutputCustom {
    public static void main(String[] args) {
        ObjectOutputStream customeWrite = null;
        try {
            customeWrite = new ObjectOutputStream(new FileOutputStream("customFile"));
            Customer customer = new Customer(700182,"Sujith");
            customeWrite.writeObject(customer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ObjectInputStream readCustomObject = null;
        try {
            readCustomObject = new ObjectInputStream(new FileInputStream("customFile"));
            try {
                System.out.println((Customer)readCustomObject.readObject());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
