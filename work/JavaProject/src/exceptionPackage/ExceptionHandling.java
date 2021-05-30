package exceptionPackage;

public class ExceptionHandling {
    int value1;
    int value2;
    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }


    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public void addition(){
        System.out.println("Initialize program!");
       try{ System.out.println("2 values are "+ this.value1/this.value2);}
       catch(Exception e){
           System.out.println("OOOPS!  Unexpected Input: Please provide second number as non-zero since any number by zero is always infinity"+e);
        }
        System.out.println("rest part of the program got executed");


    }

}
