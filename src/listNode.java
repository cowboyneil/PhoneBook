import java.util.*;
public class listNode {

    public static LinkedList<String> add() {
        //name
        LinkedList<String> phoneBook = new LinkedList<String>();
        Scanner phoneBookName = new Scanner(System.in);
        System.out.println("please enter a name");
        String phoneBookNameInput = phoneBookName.nextLine();
        phoneBook.add(phoneBookNameInput);
        //address
        Scanner phoneBookAddress = new Scanner(System.in);
        System.out.println("please enter an Address");
        String phoneBookAddressInput = phoneBookAddress.nextLine();
        phoneBook.add(phoneBookAddressInput);
        //PhoneNumber
        Scanner phoneBookNumber = new Scanner(System.in);
        System.out.println("please enter a Phone Number");
        String phoneBookNumberInput = phoneBookNumber.nextLine();
        phoneBook.add(phoneBookNumberInput);
        return phoneBook;
    }
    public static LinkedList<String> remove(LinkedList<String> phoneBook) {
        Scanner removalIndex = new Scanner(System.in);
        System.out.println("Which index do you wish to delete?");
        String removalIndexInput = removalIndex.nextLine();
        phoneBook.remove(removalIndexInput);
        return phoneBook;
    }
}
