package estoque2;

import org.junit.*;
import static org.junit.Assert.*;

// JUnit 4.3
public class TestCases_06{
	
	public static junit.framework.Test suite(){
		return new junit.framework.JUnit4TestAdapter(TestCases_06.class);
	}
	
	@Test
	public void test1()
	{
		Material oTestObject = new Material();
		Boolean registerVal3 = true;
		assertEquals(true, (oTestObject.state == State.Idle));
		oTestObject.handleEvent("registerEvent");
		assertEquals(true, (oTestObject.state == State.Registering));
		assertEquals(true, (registerVal3.booleanValue() == true));
		oTestObject.handleEvent("validEvent", registerVal3);
		
	}
	
	@Test
	public void test2()
	{
		Material oTestObject = new Material();
		Boolean registerVal3 = true;
		assertEquals(true, (oTestObject.state == State.Idle));
		oTestObject.handleEvent("registerEvent");
		assertEquals(true, (oTestObject.state == State.Registering));
		assertEquals(true, (registerVal3.booleanValue() == true));
		oTestObject.handleEvent("validEvent", registerVal3);
		assertEquals(true, (oTestObject.state == State.Registered));
		oTestObject.handleEvent("addRegisterEvent");
		assertEquals(true, (oTestObject.state == State.Idle));
		
	}
	
}