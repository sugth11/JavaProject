package inputOutputStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
       try( FileWriter filewrite = new FileWriter("fileWrterText",true)){
           String str = "My name is Sujith and I am from Nanguneri!";
            filewrite.write(str);
           System.out.println("File was written successfully");
       }
       catch(IOException e){
        e.printStackTrace();
        }
       try(FileReader fileRead = new FileReader("fileWrterText")){
            int data;
            while((data = fileRead.read())!=-1){
                System.out.println((char)data);
            }
       }
       catch(IOException e){

       }
    }
}
