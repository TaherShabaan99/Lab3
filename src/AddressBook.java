import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<BuddyInfo> buddyInfoList;


    public AddressBook() {
        buddyInfoList = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddyInfo){
        this.buddyInfoList.add(buddyInfo);
    }

    public void removeBuddy(BuddyInfo buddyInfo){
        this.buddyInfoList.remove(buddyInfo);
    }


    public static void main(String[] args) {
    System.out.println("Address Book");
    BuddyInfo buddyInfo = new BuddyInfo("Joe","Carleton",613);
    AddressBook addressBook = new AddressBook();
    addressBook.addBuddy(buddyInfo);
    addressBook.removeBuddy(buddyInfo);
    }
}