package inputOutputStream;

import java.io.*;

public class BasicInputOutStream {
    public static void main(String[] args) {
        try {
            FileInputStream reader = new FileInputStream("objectTestFile");
            FileInputStream reader1 = new FileInputStream("objectTestFile");
            try {
                System.out.println("available bytes are: "+reader.available());

                byte[] data=new byte[reader.available()];
                // read(bytes[] b)
                reader.read(data);
                String readData = new String(data);
                System.out.println(readData);
                // read()
                int x;
                do{
                    x=reader1.read();
                    if(x!=-1)
                    System.out.print((char)x);
                }while(x!=-1);


                System.out.println("Files are Read successfully!");
                reader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

            try{
                FileOutputStream writer = new FileOutputStream("basicOutputStreamFiles",true);
                String str = "I am Sujith and studying java programming!";
                String str1 = "I am Sujith and studying javaScript programming!";
                try {
                    // write();
                    writer.write(str.getBytes());
                    // write(bytes[] b)
                    byte[] b = str1.getBytes();
                    writer.write(b);
                    // write(bytes[] b, int index,int length)
                    writer.write(b,16,str1.length()-16);
                    System.out.println("Files are written successfully!");
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            catch(FileNotFoundException e){
                e.printStackTrace();
            }
    }
}
