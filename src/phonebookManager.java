import java.util.*;
public class phonebookManager {
    public void LinkedListArray(LinkedList<String> entries, LinkedList<String> AllEntries) {
        AllEntries.add(String.valueOf(entries));
        LinkedList<String> IndexTest = new LinkedList<String>();
        IndexTest.add(AllEntries.get(0));

        Scanner AskingUser = new Scanner(System.in);
        System.out.println("Type 1 if you want to test the output?");
        String UserResponde = AskingUser.nextLine();
        if(UserResponde.equals("1")) {
            System.out.println("name = " + IndexTest.get(0));
            System.out.println("Address = " + IndexTest.get(1));
            System.out.println("Phone Number = " + IndexTest.get(2));
            System.out.println(AllEntries);
        }
        System.out.println(entries);


    }
}
