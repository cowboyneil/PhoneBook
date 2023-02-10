import java.util.*;
public class phonebookManager {
    public void LinkedListArray(LinkedList<String> AllEntries) {
        Scanner AskingUser = new Scanner(System.in);
        System.out.println("Which entry would you like to view?");
        System.out.println("0 = first entry");
        System.out.println("1 = second entry");
        System.out.println("etc...");
        String UserResponse = AskingUser.nextLine();
            int userIndexNum = 0;
            try {
                userIndexNum = Integer.parseInt(UserResponse);
            } catch (NumberFormatException ex) {
                System.out.println("Sorry, no integer detected");
            }
            if (userIndexNum < AllEntries.size()/3) {
                userIndexNum = userIndexNum * 3;
                System.out.println("Name = " + AllEntries.get(userIndexNum + 0));
                System.out.println("Address = " + AllEntries.get(userIndexNum + 1));
                System.out.println("Phone Number = " + AllEntries.get(userIndexNum + 2));
            }
            else{
                System.out.println("sorry, not enough index's for valid output");
            }
    }
}
