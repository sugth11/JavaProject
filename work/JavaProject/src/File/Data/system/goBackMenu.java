package File.Data.system;

import java.util.Scanner;

public class goBackMenu {
    public goBackMenu(Scanner operation) {
        menu(operation);
    }
    public void menu(Scanner operation){
        if(operation.nextInt() == 1) {
            new SubMenu();
        } else if(operation.nextInt() == 2){
            new OptionSelections();
        }
    }
}
