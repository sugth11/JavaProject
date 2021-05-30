package inputOutputStream;

import java.io.*;

public class BufferReader {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter NAme: ");
            String name = reader.readLine();
            System.out.println("Hello "+ name);
            System.out.println("enter a number1:");
            int num = Integer.parseInt(reader.readLine());
            System.out.println("enter a number2:");
            int num2 = Integer.parseInt(reader.readLine());
            int result = num+num2;
            System.out.println("addition of 2 values are "+result);
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (NumberFormatException e){
            System.out.println("Please provide number:");
        }
        ;

    }
}
