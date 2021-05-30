package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMAin {
    public static void main(String[] args) {
        Set<User> userSet = new TreeSet<>(new UserNameComparator());
        Set<String> stringValues = new TreeSet<>();
        stringValues.add("Sujith");
        stringValues.add("Vinoth");
        stringValues.add("Sheeba");
        stringValues.add("Christina");
        System.out.println(stringValues);
        userSet.add(new User("Sujith","Joseph"));
        userSet.add(new User("Vinoth","Babu"));
        userSet.add(new User("Christina","Mary"));
        userSet.add(new User("Sheeba","Francino"));
        System.out.println(userSet);
        for(User newUserSet: userSet){
            System.out.println(newUserSet);

        }
    }
}
