package collections;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        TreeMap<Integer,String> map1 = new TreeMap<>();
        map1.put(700182,"Sujith Joseph");
        map.put(124,"Sujith");
        map.put(124,"Vinoth");
        map.put(129,"Sheeba");
        map.putAll(map1);
        map.replace(129,"Sheeba","Christina");
        map.remove(124);
        Set<Integer> keys = map.keySet();
        Collection<String> values = map.values();
        for(String val:values){
            System.out.println("values: "+val);
        }
        for(Integer Key:keys){
            System.out.println(map.get(Key));
        }
        System.out.println(map);
    }
}
