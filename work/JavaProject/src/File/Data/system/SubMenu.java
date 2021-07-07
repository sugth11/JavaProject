package File.Data.system;

import java.util.Scanner;

public class SubMenu {
    public SubMenu() {
        callSubMenu();
    }
    public void callSubMenu(){
        System.out.println("Enter 1 to add a book:");
        System.out.println("Enter 2 to delete a book:");
        System.out.println("Enter 3 to Search a book:");
        System.out.println("Enter 4 to return to Main menu:");
        Scanner operation= new Scanner(System.in);
        int getOp = operation.nextInt();
        if(getOp == 1){
            System.out.println("please enter file to add");
            Scanner files= new Scanner(System.in);
            String fileName = files.next();
            addFile add = new addFile(fileName);
            add.addFiles();
            new Scanner(System.in).next();
            OptionSelections newOption = new OptionSelections();
        }
        if(getOp == 2){
            System.out.println("please enter file to delete");
            Scanner files= new Scanner(System.in);
            String fileName = files.next();
            DeleteFile delete = new DeleteFile(fileName);
            delete.deleteFiles();
            System.out.println("please enter any key to back to main menu");
            new Scanner(System.in).next();
            OptionSelections newOption = new OptionSelections();

        }
        if(getOp == 3){
            System.out.println("please enter file to get searched..");
            Scanner files= new Scanner(System.in);
            String fileName = files.next();
            SearchFile search = new SearchFile(fileName);
            search.searchFiles();
            new Scanner(System.in).next();
            OptionSelections newOption = new OptionSelections();
        }
        if(getOp == 4){
            OptionSelections newOption = new OptionSelections();
        }
    }



}
