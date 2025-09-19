import java.util.*;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    public AddressBook(){
        buddies = new ArrayList<BuddyInfo>();
    }

    //add a new buddy to the address book
    public void addBuddies(BuddyInfo buddy){
        buddies.add(buddy);
    }
    //remove a buddy from the address book
    public void remove(BuddyInfo buddy){
        buddies.remove(buddy);
    }

    public void printList(){
        System.out.println(buddies);
    }
}
