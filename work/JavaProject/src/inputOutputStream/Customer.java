package inputOutputStream;

import java.io.Serializable;

public class Customer implements Serializable {
    private int id;
    private String name;
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }


}
