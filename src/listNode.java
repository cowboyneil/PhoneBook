import java.util.*;
public class listNode {

    public static LinkedList<String> add(LinkedList<String> AllEntries) {
        //name
        Scanner phoneBookName = new Scanner(System.in);
        System.out.println("please enter a Name");
        String phoneBookNameInput = phoneBookName.nextLine();
        AllEntries.add(phoneBookNameInput);
        //address
        Scanner phoneBookAddress = new Scanner(System.in);
        System.out.println("please enter an Address");
        String phoneBookAddressInput = phoneBookAddress.nextLine();
        AllEntries.add(phoneBookAddressInput);
        //PhoneNumber
        Scanner phoneBookNumber = new Scanner(System.in);
        System.out.println("please enter a Phone Number");
        String phoneBookNumberInput = phoneBookNumber.nextLine();
        AllEntries.add(phoneBookNumberInput);
        return AllEntries;
    }
    public static LinkedList<String> remove(LinkedList<String> AllEntries) {


        Scanner removalIndex = new Scanner(System.in);
        System.out.println("Which index do you wish to remove?");
        String removalIndexInput = removalIndex.nextLine();
        int removalInt = Integer.parseInt(removalIndexInput); //potentially include try catch here
        AllEntries.set(removalInt,null);
        System.out.println("Do you wish to replace the index with something else?");
        System.out.println("1 = yes");
        System.out.println("2 = no replacement, index will return null");
        String userReplacement = removalIndex.nextLine();
        if (userReplacement.equals("1")){
            System.out.println("What do you desire the new index to be?");
            String userReplacementString = removalIndex.nextLine();
            AllEntries.set(removalInt,userReplacementString);
        }
        return AllEntries;
    }
}