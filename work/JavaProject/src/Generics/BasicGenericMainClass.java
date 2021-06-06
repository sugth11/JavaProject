package Generics;
class GenericClass<T>{
     private T name;
    public GenericClass(T name){
        this.name =name;
    }
    public T getName(){
        return this.name;
    }
}
class GenericArrayClass<T,K>{
    private T[] myArray = (T[]) new Object[3];
    public GenericArrayClass(T name,T id,T department){
        this.myArray[0] = name;
        this.myArray[1] = id;
        this.myArray[2] = department;

    }
    public T getData(){
        return this.myArray[1];
    };
}
public class BasicGenericMainClass {
    public static void main(String[] args) {
            GenericClass<String> myClass = new GenericClass<>("Sujith");
        System.out.println(myClass.getName());
        GenericArrayClass<String,Integer> myArrayClass = new GenericArrayClass<>("Sujith","700182","CSE");
        System.out.println(myArrayClass.getData());
    }
}
