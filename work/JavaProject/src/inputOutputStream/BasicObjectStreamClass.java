package inputOutputStream;

import java.io.*;

public class BasicObjectStreamClass {
    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("basicOutputStreamFile");
            PrintStream printFile = new PrintStream(file);
            printStreamObjectClass objectClass = new printStreamObjectClass();
            objectClass.index = 700182;
            objectClass.name = "Sujith Joseph";
            objectClass.location = "Chennai";
            printFile.println(objectClass.index);
            printFile.println(objectClass.name);
            printFile.println(objectClass.location);

            System.out.println("object is printed successfully!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
