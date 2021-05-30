package collections;

import java.util.*;

public class CollectionsMain {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("Hyundai");
        a.add("Swift Dezire");
        List<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add(2,"Swift");
        cars.addAll(2, a);
        ArrayListClass newArr = new ArrayListClass();
        ArrayList<String> addingArray = newArr.ArrayMethod();
        cars.addAll(5,addingArray);
        System.out.println(cars.get(3));
        System.out.println(cars.indexOf("Swift Dezire"));
        System.out.println(cars);


        System.out.println(cars.contains("BMW"));

        for(String car: cars){
            System.out.println(car);
        }
    }

}
