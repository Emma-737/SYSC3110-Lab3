//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Lily", "34 Greenboro lane", "613-555-2356");
        System.out.println("Hello " + buddy.getName());

        BuddyInfo buddy2 = new BuddyInfo();
        System.out.println("Hello " + buddy2.getName());

        //test for address book
        BuddyInfo buddy3 = new BuddyInfo("Jane", "12 ashbury st", "613-238-4950");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddies(buddy3);
        //addressBook.addBuddies(buddy2);
        //addressBook.printList();
        addressBook.remove(buddy3);
        //addressBook.printList();
        System.out.println("This is a Github change");

        //System.out.println("address book");
    }
}
