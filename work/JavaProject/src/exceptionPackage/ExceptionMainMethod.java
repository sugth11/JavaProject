package exceptionPackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMainMethod {
    public static void main(String[] args) {
        ExceptionHandling exceptions = new ExceptionHandling();
        System.out.println("please enter 2 values: ");
        Scanner userinput1 = new Scanner(System.in);
        try {
            int value1 = userinput1.nextInt();

            int value2 = userinput1.nextInt();
            exceptions.setValue1(value1);
            exceptions.setValue2(value2);
            exceptions.addition();
        } catch (InputMismatchException e){
            System.out.println("entered number should be an integer!"+e.getMessage());
        }


    }
}
