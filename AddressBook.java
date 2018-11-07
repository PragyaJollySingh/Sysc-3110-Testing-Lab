
import javax.swing.DefaultListModel;

public class AddressBook {
	
	private DefaultListModel<BuddyInfo> addressBook;
	
	public AddressBook() {
		addressBook = new DefaultListModel<BuddyInfo>();
	}
	public DefaultListModel<BuddyInfo> getAddressBook() {
		return addressBook;
	}
	public void setAddress(int index, String address) {
		addressBook.getElementAt(index).setAddress(address);
	}
	
	public void setPhoneNumber(int index, String phoneNumber) {
		addressBook.getElementAt(index).setPhoneNumber(phoneNumber);
	}
	
	public void setName(int index, String name) {
		addressBook.getElementAt(index).setName(name);
	}

	public void remove(int index) {
		addressBook.remove(index);
	}

	public void addBuddy(BuddyInfo buddies) {
		addressBook.addElement(buddies);
	}
	
	public void Clear() {
		addressBook.clear();
	}

	public String toString() {
		String buddies = "";
		
		for(int i=0; i<addressBook.getSize(); i++){
			buddies = addressBook.get(i).getName() + ", " + addressBook.get(i).getAddress() + ", " + addressBook.get(i).getPhoneNumber();
		}
		return buddies;
	}
	
	public int getSize() {
		return addressBook.size();
	}
	
	
	
	
	
	
		



}


