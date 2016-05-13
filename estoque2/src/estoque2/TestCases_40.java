package estoque2;

import org.junit.*;
import static org.junit.Assert.*;

// JUnit 4.3
public class TestCases_40{
	
	public static junit.framework.Test suite(){
		return new junit.framework.JUnit4TestAdapter(TestCases_40.class);
	}
	
	@Test
	public void test1()
	{
		Material oTestObject = new Material();
		Integer sku3 = -182289;
		Integer unit3 = 254387;
		Integer sku6 = -276950;
		Integer unit6 = 18345;
		assertEquals(true, (oTestObject.state == State.Idle));
		oTestObject.handleEvent("registerEvent");
		assertEquals(true, (oTestObject.state == State.Registering));
		oTestObject.handleEvent("validEvent", sku3, unit3);
		assertEquals(true, (oTestObject.state == State.Registering));
		oTestObject.handleEvent("validEvent", sku6, unit6);
		assertEquals(true, (oTestObject.state == State.Registered));
		oTestObject.handleEvent("newRegisterEvent");
		
	}
	
	@Test
	public void test2()
	{
		Material oTestObject = new Material();
		Integer sku3 = -73906;
		Integer unit3 = 45492;
		Integer sku6 = -312698;
		Integer unit6 = -130574;
		assertEquals(true, (oTestObject.state == State.Idle));
		oTestObject.handleEvent("registerEvent");
		assertEquals(true, (oTestObject.state == State.Registering));
		oTestObject.handleEvent("validEvent", sku3, unit3);
		assertEquals(true, (oTestObject.state == State.Registering));
		oTestObject.handleEvent("validEvent", sku6, unit6);
		assertEquals(true, (oTestObject.state == State.Registered));
		oTestObject.handleEvent("finaliseEvent");
		
	}
	
}