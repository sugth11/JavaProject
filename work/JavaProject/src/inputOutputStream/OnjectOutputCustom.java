package inputOutputStream;

import java.io.*;
//the class used for writing and reading must implement Serializable interface
// the class must define default constructor otherwise it cannot be readable
// it will not serialize  static and transient method/member and will not be stored in writing files
// print file will show as binary data in files
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
