import org.junit.*;

public class BuddyInfoTesting {
	BuddyInfo Alec;
	BuddyInfo Pragya;
	BuddyInfo Emma;
	
	

	@Before
	public void setUp() throws Exception{
		Alec= new BuddyInfo("Alec","137 Orkney Private","6135675297");
		Pragya= new BuddyInfo("Pragya","137 Shirley Drive","6135468096");
		Emma= new BuddyInfo("Emma","123 Charming Lane","6479376263");
	}
	/** At Test is written so that each test case is clearly indicated
	**/
	@Test
	public void TestgetName() {
		Assert.assertEquals("Pragya's name should be Pragya ", "Pragya", Pragya.getName());
	}
	@Test
	public void TestsetName() {
		Alec.setName("Gibbon");
		Assert.assertEquals("Alec name should be set to Gibbon", "Gibbon",Alec.getName());
	}
	@Test
	public void TestgetAddress() {
		Assert.assertEquals("Address should be 123 Charming lane","123 Charming Lane",Emma.getAddress());
	}
	@Test
	public void TestsetAddress() {
		Emma.setAddress("123 Noise lane");
		Assert.assertEquals("Address should be 123 Noise lane","123 Noise lane",Emma.getAddress());
	}
	@Test
	public void TestgetPhoneNumber() {
		Assert.assertEquals("The phone number should be 6135675297","6135675297",Alec.getPhoneNumber());
	}
	@Test
	public void TestsetPhoneNumber() {
		Alec.setPhoneNumber("911");
		Assert.assertEquals("The phone number should be 911","911",Alec.getPhoneNumber());
		
	}
	@Test
	public void TesttoString() {
		Assert.assertEquals("The string should be Gibbon,137 Orkney Private,911", Alec.toString());
	}
	
}
