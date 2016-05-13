package estoque2;

import org.junit.*;
import static org.junit.Assert.*;

// JUnit 4.3
public class TestCases_36{
	
	public static junit.framework.Test suite(){
		return new junit.framework.JUnit4TestAdapter(TestCases_36.class);
	}
	
	@Test
	public void test1()
	{
		Material oTestObject = new Material();
		Integer sku3 = -357905;
		Integer unit3 = -251768;
		Integer sku6 = -342786;
		Integer unit6 = 230;
		assertEquals(true, (oTestObject.state == State.Idle));
		oTestObject.handleEvent("registerEvent");
		assertEquals(true, (oTestObject.state == State.Registering));
		oTestObject.handleEvent("validEvent", sku3, unit3);
		assertEquals(true, (oTestObject.state == State.Registering));
		oTestObject.handleEvent("validEvent", sku6, unit6);
		assertEquals(true, (oTestObject.state == State.Registered));
		oTestObject.handleEvent("finaliseEvent");
		
	}
	
	@Test
	public void test2()
	{
		Material oTestObject = new Material();
		Integer sku3 = -21586;
		Integer unit3 = -365069;
		Integer sku6 = -141976;
		Integer unit6 = 368693;
		assertEquals(true, (oTestObject.state == State.Idle));
		oTestObject.handleEvent("registerEvent");
		assertEquals(true, (oTestObject.state == State.Registering));
		oTestObject.handleEvent("validEvent", sku3, unit3);
		assertEquals(true, (oTestObject.state == State.Registering));
		oTestObject.handleEvent("validEvent", sku6, unit6);
		assertEquals(true, (oTestObject.state == State.Registered));
		oTestObject.handleEvent("newRegisterEvent");
		
	}
	
}