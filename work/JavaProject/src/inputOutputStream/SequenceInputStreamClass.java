package inputOutputStream;

import java.io.*;

public class SequenceInputStreamClass {
    public static void main(String[] args) throws Exception {
        try {
            FileInputStream file1 = new FileInputStream("basicOutputStreamFile");
            FileInputStream file2 = new FileInputStream("basicOutputStreamFiles");
            SequenceInputStream combineFiles = new SequenceInputStream(file1,file2);
            FileOutputStream destinationFile = new FileOutputStream("destinationFile.txt");
            int a;
            while((a=combineFiles.read())!=-1){
                try {
                    if(a>=65 && a<=120)
                    destinationFile.write(a+32);
                    else
                        destinationFile.write(a);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                finally{
                    file1.close();
                    file2.close();
                    combineFiles.close();
                    destinationFile.close();
                }
            }
            System.out.println("finished Writing in to Destination file!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
