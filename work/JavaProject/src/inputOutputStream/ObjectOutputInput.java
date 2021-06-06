package inputOutputStream;

import java.io.*;
//the class used for writing and reading must implement Serializable interface
// the class must define default constructor otherwise it cannot be readable
// it will not serialize  static and transient method/member and will not be stored in writing files
// print file will show as binary data in files
public class ObjectOutputInput {
    public static void main(String[] args) {
        ObjectOutputStream stream= null;
        try {
            stream = new ObjectOutputStream(new FileOutputStream("objectTestFile"));
            String str ="I am Sujith, Software Engineer";
            stream.writeObject(str);
            System.out.println("file is written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        ObjectInputStream readStream = null;
        try {
            readStream = new ObjectInputStream(new FileInputStream("objectTestFile"));
            System.out.println((String)readStream.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            if(stream!=null) {
                try {
                    readStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
