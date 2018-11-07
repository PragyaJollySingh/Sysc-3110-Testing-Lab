
public class BuddyInfo {
	
	private String name;
	private String address;
	private String phoneNumber;
	
	public BuddyInfo(String name, String address, String phoneNumber) {
		this.name=name;
		this.address=address;
		this.phoneNumber=phoneNumber;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String toString() {
		String temp= (" "+this.getName()+"," +this.getAddress()+ ","+this.getPhoneNumber());
		return temp;
	}


	/**public static void main  (String [] args) {
		BuddyInfo temp= new BuddyInfo("Pragya","82 Picola Street","6137498394");
		String test= temp.toString();
		

	}**/
}

