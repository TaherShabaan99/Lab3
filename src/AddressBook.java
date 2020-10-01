import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<BuddyInfo> buddyInfoList;


    public AddressBook() {
        buddyInfoList = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddyInfo){
        if(buddyInfo !=null) {
            this.buddyInfoList.add(buddyInfo);
        }
    }

    public BuddyInfo removeBuddy(int index){
        if( index >= 0 && index < buddyInfoList.size()) {
            return this.buddyInfoList.remove(index);
        }
        return null;
    }


    public static void main(String[] args) {
        System.out.println("Address Book");
        BuddyInfo buddyInfo = new BuddyInfo("Joe","Carleton",613);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddyInfo);
        addressBook.removeBuddy(0);
        System.out.println("Testing New Changes");
        System.out.println("push your changes after committing");
        System.out.println("Another Change");



    }
}