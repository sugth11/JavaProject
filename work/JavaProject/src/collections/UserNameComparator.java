package collections;

import java.util.Comparator;

public class UserNameComparator implements Comparator<User> {
    @Override
    public int compare(User user2,User user1){
        String userName1 = user1.getPassword();
        String userName2 = user2.getPassword();
       return userName1.compareTo(userName2);

    }

}
