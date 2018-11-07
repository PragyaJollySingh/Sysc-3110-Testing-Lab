import javax.swing.DefaultListModel;

import org.junit.*;
public class AddressBookTesting {
	public static DefaultListModel<BuddyInfo> Pragya;
	public static DefaultListModel<BuddyInfo> Robyn;
	public static BuddyInfo Jason;
	public static BuddyInfo Alec;
	
	@Before
	public void AddressBookTesting() throws Exception{
		Pragya= new DefaultListModel<BuddyInfo>();
		Robyn= new DefaultListModel<BuddyInfo>();
		Jason= new BuddyInfo("Jason","Carleton","613");
		Alec= new BuddyInfo("Alec","123 Shameless Street","61369696");
	}
	@Test
	public void TestaddBuddy() {
		 Pragya.addElement(Jason);
		 Robyn.addElement(Jason);
		 Robyn.addElement(Alec);
		Assert.assertEquals("The size should be 1",1,Pragya.getSize());
	}
	@Test
	public void Testsize() {
		Pragya.addElement(Alec);
		Assert.assertEquals("The answer should be 1", 1,Pragya.getSize());

	}
	@Test
	public void TesttoString() {
		Pragya.addElement(Jason);
		Assert.assertEquals("The name in the Address book should be Jason,Carleton,613","[ Jason,Carleton,613]",Pragya.toString());
		
	}
	@Test
	public void TestClear() {
		Pragya.clear();
		Assert.assertEquals("There should be nothing in the AddressBook ",0, Pragya.getSize());
	}
	@Test
	public void TestremoveBuddy() {
		Robyn.addElement(Alec);
		Robyn.remove(0);
		Assert.assertEquals("The size should be 0 ",0, Robyn.getSize());
	}
	
	

}
