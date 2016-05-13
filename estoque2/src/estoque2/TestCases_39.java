package estoque2;

import org.junit.*;
import static org.junit.Assert.*;

// JUnit 4.3
public class TestCases_39{
	
	public static junit.framework.Test suite(){
		return new junit.framework.JUnit4TestAdapter(TestCases_39.class);
	}
	
	@Test
	public void test1()
	{
		Material oTestObject = new Material();
		Integer sku3 = -95217;
		Integer unit3 = 117654;
		Integer sku6 = -7851;
		Integer unit6 = -63121;
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
		Integer sku3 = -127083;
		Integer unit3 = -69866;
		Integer sku6 = 131208;
		Integer unit6 = -24058;
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