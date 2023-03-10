import java.util.*;
public class Main {
    public static void main(String[] args) {

        LinkedList<String> AllEntries = new LinkedList<String>(); // manager declaration

        while (true) {
            // Would you like to access the phone book?
            System.out.println("What would you like to access?");
            Scanner editOrView = new Scanner(System.in);
            System.out.println("1 = add");
            System.out.println("2 = remove/replace entries");
            System.out.println("3 = view entry");
            System.out.println("Any other key = quit");
            String inputEditOrView = editOrView.nextLine();
            if (inputEditOrView.equals("1")) {
                listNode nodeAddition = new listNode();
                nodeAddition.add(AllEntries);
            } else if (inputEditOrView.equals("2")) {// user wants to remove
                listNode nodeRemoval = new listNode();
                nodeRemoval.remove(AllEntries);
            }
            else if (inputEditOrView.equals("3")){ // user input wants to view
                phonebookManager manage = new phonebookManager();
                manage.LinkedListArray(AllEntries);
            }
            else{
                break;
            }
        }//while
    }//main
}//class