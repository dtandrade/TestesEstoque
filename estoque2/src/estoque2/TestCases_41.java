package estoque2;

import org.junit.*;
import static org.junit.Assert.*;

// JUnit 4.3
public class TestCases_41{
	
	public static junit.framework.Test suite(){
		return new junit.framework.JUnit4TestAdapter(TestCases_41.class);
	}
	
	@Test
	public void test1()
	{
		Material oTestObject = new Material();
		Integer sku3 = -478212;
		Integer unit3 = 32613;
		Integer sku6 = 460934;
		Integer unit6 = 724550;
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
		Integer sku3 = -478212;
		Integer unit3 = 32613;
		Integer sku6 = 1;
		Integer unit6 = 1;
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
	public void test3()
	{
		Material oTestObject = new Material();
		Integer sku3 = 126644;
		Integer unit3 = 110308;
		Integer sku6 = 483414;
		Integer unit6 = 994780;
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
	public void test4()
	{
		Material oTestObject = new Material();
		Integer sku3 = 126644;
		Integer unit3 = 110308;
		Integer sku6 = 1;
		Integer unit6 = 1;
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