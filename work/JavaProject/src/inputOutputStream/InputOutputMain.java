package inputOutputStream;

import java.io.*;
import java.util.Scanner;

public class InputOutputMain {
    public static void main(String[] args) throws FileNotFoundException {
        DataOutputStream files = null;
        files = new DataOutputStream(new FileOutputStream("newTest"));
        try {
            files.writeInt(10);
            files.writeFloat(13.321f);
            files.writeBoolean(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            try {
                files.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        DataInputStream filesRead = null;
        filesRead = new DataInputStream(new FileInputStream("newTest"));
        try {
            System.out.println(filesRead.readInt());
            System.out.println(filesRead.readFloat());
            System.out.println(filesRead.readBoolean());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
