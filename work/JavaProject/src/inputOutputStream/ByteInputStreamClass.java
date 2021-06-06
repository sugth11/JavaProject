package inputOutputStream;

import java.io.ByteArrayInputStream;

public class ByteInputStreamClass {
    public static void main(String[] args) {
        byte b[]={'a','b','c'};
        ByteArrayInputStream byteStream = new ByteArrayInputStream(b);
        int a;
        while((a=byteStream.read())!=-1){
            System.out.println((char)a);
        }
    }
}
