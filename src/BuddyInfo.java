public class BuddyInfo {
    private String name;
    private String address;
    private String phoneNumber;

    //constructor with values passed in
    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    // default constructor
    public BuddyInfo(){
        this("Hannah", "32 York St", "613-288-2934");
    }
/*
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Lily", "34 Greenboro lane", "613-555-2356");
        System.out.println("Hello " + buddy.getName());

        BuddyInfo buddy2 = new BuddyInfo();
        System.out.println("Hello " + buddy2.getName());
    }
*/
    //getter to return the name of the friend
    public String getName() {
        return name;
    }
}
